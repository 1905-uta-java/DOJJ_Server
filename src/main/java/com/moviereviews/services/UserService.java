package com.moviereviews.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviereviews.dao.UserDaoImp;
import com.moviereviews.models.User;

@Service
public class UserService {
	
	@Autowired
	UserDaoImp ud;
	
	//Get the User's information from their email
	public User getByEmail(String email) {
		//GET USER FROM DB WITH EMAIL
		return ud.getUserByEmail(email);
	}
	
	//Create a User
	public void create(User u) {
		//CREATE A NEW USER TO DB
		ud.createUser(u);
	}
	
	//Update a User's information
	public int update(User u) {
		//UPDATE A USER IN DB
		return ud.updateUser(u);
	}
	
	//Delete a User
	public int delete(String email) {
		//DELETE A USER IN DB
		return ud.deleteUser(email);
	}
	
}
