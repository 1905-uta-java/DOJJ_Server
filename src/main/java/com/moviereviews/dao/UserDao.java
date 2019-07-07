package com.moviereviews.dao;

import java.util.List;

import com.moviereviews.models.User;

public interface UserDao {

	public List<User> getUsers();
	public User getUserByEmail(String email);
	public User getUserByUsername(String username);
	public int updateUser(User u);
	public void createUser(User u);
	public int deleteUser(String email);
}
