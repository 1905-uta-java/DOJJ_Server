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
		
		//VALIDATE THAT PASSWORD AND Username ARE NOT EMPTY/NULL
		
		 User u = ud.getUserByUsername(username);
		 if(password.equals(u.getPassword())) {
			 u.setPassword("");
			 return u;
		 }else {
			 return new User();
		 }
	}
	
	

}
