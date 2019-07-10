package com.moviereviews.services;

import org.springframework.stereotype.Service;

import com.moviereviews.dao.UserDao;
import com.moviereviews.dao.UserDaoImp;
import com.moviereviews.models.User;

@Service
public class UserService {
	
	UserDao ud = new UserDaoImp();
	
	//Get the User's information from their username
	public User getByUsername(String username) {
		if(username == null || username == "") {
			return new User();
		}
		//GET USER FROM DB WITH USERNAME
		return ud.getUserByUsername(username);
	}
	
	//Create a User
	public String create(User u) {
		if(u == null) {
			return "Failed";
		}
		//Check if the user exists with the username
		User existUser = getByUsername(u.getUsername());
		if(u.getUsername().equals(existUser.getUsername())) {
			return "Username already exists";
		}else {
			ud.createUser(u);
			return "Account Created";
		}
		
	}
	
	//Update a User's information
	public int update(User u) {
		if(u == null) {
			return -1;
		}
		//UPDATE A USER IN DB
		if(u.getReputation() == 1) {
			ud.incUserScore(u.getUsername());
			return 0;
		}else {
			ud.decUserScore(u.getUsername());
			return 0;
		}
	}
	
	//Delete a User
	public int delete(String username) {
		if(username == null || username == "") {
			return -1;
		}
		//DELETE A USER IN DB
		return ud.deleteUser(username);
	}
	
}
