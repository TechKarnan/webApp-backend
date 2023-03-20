package com.example.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webapp.entity.User;
import com.example.webapp.serviceImpl.UserServiceImpl;

@RestController
public class Controller {

	@Autowired
	private UserServiceImpl userserviceImpl;
	
	@PostMapping("/register")
	public Boolean register (User user) {
		
		return true;
	} 
	
	
	@GetMapping("/login")
	public Boolean login(User user) {
		return userserviceImpl.login(user);
		
	}
}
