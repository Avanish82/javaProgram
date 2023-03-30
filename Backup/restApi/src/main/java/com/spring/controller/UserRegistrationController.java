package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 

import com.spring.model.ResponseData;
import com.spring.model.User;
import com.spring.service.UserService;

import io.swagger.annotations.Api; 

@RestController
@Api(tags = "UserRegistrationController", value = "UserRegistrationQueries", description = "UserRegistrationController Queries")

public class UserRegistrationController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/show")
	public String show() {
		return "Hi dear";
	}
	
	@GetMapping("/UserName")
	public String userName() {
		return "HI i am avanish";
	}
	//third party api call and perticular data filter and save
 	 @RequestMapping(value = "/addThirdpartyData", method= RequestMethod.GET ,produces = "application/json")
     public ResponseEntity<ResponseData> addThirdPartyApiData(@PathVariable User id){
 		 return userService.addThirdPartyApiData(id);
 	 }
 	 
}
