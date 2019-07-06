package com.moviereviews.util;

import com.moviereviews.dao.UserDao;
import com.moviereviews.dao.UserDaoImp;
import com.moviereviews.models.User;

public class DriverUtil {

	/*
	 * Here is where specific methods for DAO implementation are being tested
	 * For simple use until JUNIT tests are fully implemented
	 */
	
	public static void main(String[] args) {
		User u = new User("steveMan@gmail.com", "steve49Man", "test4pass", 0, "02");
		UserDao uDao = new UserDaoImp();
		//uDao.createUser(u); WORKS
	}

}
