package com.moviereviews.util;

import java.util.List;

import com.moviereviews.dao.UserDao;
import com.moviereviews.dao.UserDaoImp;
import com.moviereviews.models.User;

public class ValidationUtil {
	
	private static UserDao uDao = new UserDaoImp();
	private static char[] illegalChars = {' ', ';', ':', '`', '~', '{', '}', '[', ']', '(', ')'};
	
	// Validate whether there are illegal characters in the inputed string
	public boolean illegalCharacters(String input) {
		for(char c : illegalChars) {
			if(input.contains("" + c)) {
				return false;
			}
		}
		return true;
	}
	
	// Validate if the inputed username exists
	public boolean userExists(String username) {
		List<User> uList = uDao.getUsers();
		for(User u : uList) {
			if(u.getUsername().equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	// Validate if the inputed login information is correct
	public boolean userInfoCorrect(String username, String password) {
		if(this.userExists(username)) {
			User u = uDao.getUserByUsername(username);
			if(u.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	// Validate if the inputed email is in the correct format
	public boolean validEmail(String email) {
		if(this.illegalCharacters(email)) {
			char[] chars = email.toCharArray();
			boolean hasAt = false;
			boolean hasDot = false;
			for(char c : chars) {
				if(c == '@') {
					hasAt = true;
				}
				if(hasAt && c == '.') {
					hasDot = true;
				}
			}
			if(hasAt && hasDot) {
				return true;
			}
		}
		return false;
	}
	
	// Validate if the inputed password is in the correct format and does not contain illegal characters
	public boolean validPassword(String password) {
		if(this.illegalCharacters(password)) {
			if(password.length() > 6 && password.length() < 18) {
				return true;
			}
		}
		return false;
	}
}
