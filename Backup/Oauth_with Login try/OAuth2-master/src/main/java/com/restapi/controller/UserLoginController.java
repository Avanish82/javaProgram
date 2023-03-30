//package com.restapi.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.restapi.entity.LoginRequest;
//import com.restapi.service.UserLoginService;
//
//@RestController
//public class UserLoginController {
//	
//	@Autowired
//	private UserLoginService userLoginService;
//	
//	@PostMapping("/login")
//	public ResponseEntity<LoginRequest> UserLogin(@RequestBody LoginRequest UserName, LoginRequest userPassword){
//	return UserLoginService.save();	
//	}
//
//}
