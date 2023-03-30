package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.User;
import com.spring.service.RestTemplateService;

@RestController
public class RestTemplateController {
	
	@Autowired
	private RestTemplateService restTemplateService;
	
	@GetMapping("/getAll")
	public ResponseEntity<String> getALlData() {
		return restTemplateService.allEmployee();
	}

	 @PostMapping("/AddUser")
	 public ResponseEntity<User> createUser(@RequestBody User user){
		 return restTemplateService.saveByUser(user);
	 }
	 
	 @GetMapping("/getByID")
		public ResponseEntity<User> getByID(@PathVariable Long id) {
			return restTemplateService.allEmployeeByID(id);
		}
	 
	 @PutMapping("/UpdateByUser")
	 public User createUser(@RequestBody User user, @PathVariable Long id ){
		 return (User) restTemplateService.updateByUser(id);
	 }
	 
	 @DeleteMapping("/DeleateByUser/{id}")
	    public void DeleateByUser(@PathVariable Long id){
		 restTemplateService.DeleateByUser(id);
	    }
	 
	 
}
