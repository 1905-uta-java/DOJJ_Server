package com.moviereviews.util;

import com.moviereviews.dao.ReviewDao;
import com.moviereviews.dao.ReviewDaoImp;
import com.moviereviews.dao.UserDao;
import com.moviereviews.dao.UserDaoImp;
import com.moviereviews.models.Review;
import com.moviereviews.models.User;
import com.moviereviews.services.ReviewService;
import com.moviereviews.services.UserService;

public class DriverUtil {

	/*
	 * Here is where specific methods for DAO implementation are being tested
	 * For simple use until JUNIT tests are fully implemented
	 */
	
	public static void main(String[] args) {
		User u = new User("", "bob", "", 1, "");
		UserDao ud = new UserDaoImp();
		UserService us = new UserService();
		
		Review r = new Review(42, "bob", "", 0, 0, 1, null);
		ReviewDao rd = new ReviewDaoImp();
		ReviewService rs = new ReviewService();
		
		us.update(u);
		rs.update(r);
		
		
	}

}
