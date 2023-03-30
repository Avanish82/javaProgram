package com.spring.service;
 

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map; 

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.model.User;

@Service
public class RestTemplateService {
	
	private static final String get_All_User_URL = "http://localhost:8000/rest/getAllUser";
	private static final String create_All_User_URL = "http://localhost:8000/rest/list";
	private static final String get_by_Id_User_URL ="http://localhost:8000/rest/getuser/{id}";
	private static final String update_by_Id_User_URL ="http://localhost:8000/rest/updateUser/{id}";
	private static final String delete_by_Id_User_URL ="http://localhost:8000/rest/deleteUser/{id}";
	
	
	//Method to get all employee 
	RestTemplate restTemplate= new RestTemplate();
	
	public ResponseEntity<String> allEmployee(){
	
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        
	    HttpEntity<String> entity =new HttpEntity<String>("parameters", headers);
	    
	    ResponseEntity<String> response = restTemplate.exchange(get_All_User_URL, HttpMethod.GET, entity, String.class);
	   
	    return response;
	
	}
// persist data thirdparty api 
	public ResponseEntity<User> saveByUser(User user) {
		return restTemplate.postForEntity(create_All_User_URL, user, User.class);
	 
	}

//Get value by user id	
	public ResponseEntity<User> allEmployeeByID(Long id) {
		Map<String, Long> param = new HashMap<String, Long>();
		param.put("id", id);
		return restTemplate.getForEntity(get_by_Id_User_URL, User.class, param);
		

	}
	public User updateByUser(Long id) {
		 restTemplate.put(update_by_Id_User_URL, id);
		return null;
	}
	public void DeleateByUser(Long id) {
		restTemplate.delete(delete_by_Id_User_URL, id);
		
	}
	 

	
}
