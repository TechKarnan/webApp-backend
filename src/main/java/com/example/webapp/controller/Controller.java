package com.example.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.webapp.entity.User;
import com.example.webapp.model.UserModel;
import com.example.webapp.serviceImpl.UserServiceImpl;

@RestController
public class Controller {

	@Autowired
	private UserServiceImpl userserviceImpl;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/register")
	public Boolean register (@RequestBody UserModel userModel) {
		
		return userserviceImpl.register(userModel);
	} 
	
	
	@GetMapping("/login")
	public String login(@RequestParam String username , @RequestParam String password) {
		return userserviceImpl.login(username,password);
		
	}
}
