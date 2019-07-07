package com.moviereviews.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviereviews.dao.UserDaoImp;
import com.moviereviews.models.User;

@Service
public class LoginService {
	
	@Autowired
	UserDaoImp ud;
	
	//Validate a users login information
	public User validateLogin(String email, String password) {
		
		//VALIDATE THAT PASSWORD AND EMAIL ARE NOT EMPTY/NULL
		
		
		 User u = ud.getUserByEmail(email);
		 if(password.equals(u.getPassword())) {
			 u.setPassword("");
			 return u;
		 }else {
			 return new User();
		 }
	}
	
	

}
