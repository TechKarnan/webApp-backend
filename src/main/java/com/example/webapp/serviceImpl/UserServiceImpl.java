package com.example.webapp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.webapp.entity.User;
import com.example.webapp.repo.UserRepo;

@Component
public class UserServiceImpl {
	
	@Autowired
	private UserRepo userRepo;
	
	public Boolean login(User user)
	{
		User u = userRepo.findByuserName(user.getUserName());
		if(u != null)
		{
			return true;
		}
		
		return false;
	}

}
