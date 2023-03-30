package com.spring.service;

import com.spring.model.ResponseData;
import com.spring.model.ThirdPartyApiDto;
import com.spring.model.User;
import com.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    
    private final RestTemplate restTemplate;
  
    @Autowired
    public UserService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}


//    public UserService(UserRepository repository) {
//        this.repository = repository;
//    }


    public User userAdd(User user){
        return repository.save(user);
    }

    public Optional<User> findById(Long id){
        return repository.findById(id);
    }
    @CachePut(value = "cache",key = "#id")
    public User updateUser(User user, Long id){
        Optional<User> user1=repository.findById(id);

        return repository.save(user);
    }
    @Cacheable(value = "cache")
    public List<User> getAllUser(){
        return repository.findAll();
    }

    @CacheEvict(value = "cache",key = "#id")
    public void deleteUser(User user, Long id){
         repository.deleteById(id);
    }
    @Cacheable(value = "cache")
    public Optional<User> getUser(Long id){
        return repository.findById(id);    }

        @CacheEvict(value = "cache")
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }


		public String viewStudent() {
			// TODO Auto-generated method stub
			//return restTemplate.getForObject("https://dummy.restapiexample.com/api/v1/employee/1", String.class); working fine
	        ThirdPartyApiDto t= new ThirdPartyApiDto();
	        String st = restTemplate.getForObject("https://dummy.restapiexample.com/api/v1/employee/1", String.class);
	   //     t=st.getEmaployee_name();
	        System.out.println(st.length());
			return st;
		}

 //third party api data persist in data base
		
		public ResponseEntity<ResponseData> addThirdPartyApiData(User user) {
			ResponseData response=new ResponseData();
			User u=new User();
			u.getId();
			u.getName();
			u.getAddress();
            u.getPhone();
            u.getClass();
            
            response.setUser(u);
            Long id=u.getId();
            RestTemplate restTemplate1 =new RestTemplate();
			String endPoint="https://dummy.restapiexample.com/api/v1/employee/1";
			
			ResponseEntity<ThirdPartyApiDto> data= restTemplate1.getForEntity(endPoint, ThirdPartyApiDto.class, id);
			 if(data.getStatusCodeValue()==200) {
				 
				 ThirdPartyApiDto t1=data.getBody();
				 response.setThirdPartyApiDto(t1);
			 }
				 return new ResponseEntity<ResponseData>(response,HttpStatus.OK);
		}


		public List<User> getAllUserInformation() {
			return repository.findAll();
		}
}
