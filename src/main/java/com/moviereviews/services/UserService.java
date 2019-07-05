package com.moviereviews.services;

import org.springframework.stereotype.Service;

import com.moviereviews.models.User;

@Service
public class UserService {
	
	//Get the User's information from their email
	public User getByEmail(String email) {
		//GET USER FROM DB WITH EMAIL
		return null;
	}
	
	//Create a User
	public int create(User u) {
		//CREATE A NEW USER TO DB
		return 0;
	}
	
	//Update a User's information
	public int update(User u) {
		//UPDATE A USER IN DB
		return 0;
	}
	
	//Delete a User
	public int delete(String email) {
		//DELETE A USER IN DB
		return 0;
	}
	
}
