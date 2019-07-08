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
		//GET USER FROM DB WITH USERNAME
		return ud.getUserByUsername(username);
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
