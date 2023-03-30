package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.UserService;

@RestController
public class UserManagementController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/GEt")
	public String userDetails() {
		return "hi dear what you want this is testing perpose only";
	}
	
	@PostMapping("/POST")
	public String userDetailsPut() {
		return "hi dear what you want this is testing perpose only";
	}
	
	@PutMapping("/PUT")
	public String userDetailspush() {
		return "hi dear what you want this is testing perpose only";
	}
	@DeleteMapping("/DELETE")
	public String userDetailsadd() {
		return "hi dear what you want this is testing perpose only";
	}
	 
}
