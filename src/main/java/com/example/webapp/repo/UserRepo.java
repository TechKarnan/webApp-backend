package com.example.webapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.webapp.entity.User;


@Repository
public interface UserRepo extends JpaRepository<User,Long> {

	public User findByuserName(String username);
	
}
