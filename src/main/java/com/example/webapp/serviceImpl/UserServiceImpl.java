package com.example.webapp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.webapp.entity.User;
import com.example.webapp.model.UserModel;
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
	
	public Boolean register(UserModel userModel) {
		
		
		User u = new User();
		
		
		if(userModel!=null) {
			u.setUserName(userModel.getUsername());
			u.setPassword(userModel.getPassword());
			User u1 = userRepo.save(u);
		}
		
		return true;
	}

}
