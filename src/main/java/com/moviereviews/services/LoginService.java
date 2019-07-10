package com.moviereviews.services;

import org.springframework.stereotype.Service;

import com.moviereviews.dao.UserDao;
import com.moviereviews.dao.UserDaoImp;
import com.moviereviews.models.User;

@Service
public class LoginService {
	
	UserDao ud = new UserDaoImp();
	
	//Validate a users login information
	public User validateLogin(String username, String password) {
		
		//VALIDATE THAT PASSWORD AND username ARE NOT EMPTY/NULL
		if(username == null || username == "" || password == null || password == "") {
			return new User();
		}
		
		
		 User u = ud.getUserByUsername(username);
		 if(u != null) {
			 if(password.equals(u.getPassword())) {
				 u.setPassword("");
			 	return u;
			 }else {
				 return new User();
			 }
		 }
		 return new User();
		 
	}
	
	

}
