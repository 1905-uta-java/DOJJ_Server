package com.moviereviews.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.moviereviews.models.User;

public class LoginServiceTest {

	@Test
	public void testValidateLogin() {
		LoginService ls = new LoginService();
		//Test if strings are null
		assertEquals(new User(), ls.validateLogin(null, "password"));
		assertEquals(new User(), ls.validateLogin("bob", null));
		assertEquals(new User(), ls.validateLogin(null, null));
		
		assertEquals(new User(), ls.validateLogin("", "password"));
		assertEquals(new User(), ls.validateLogin("bob", ""));
		assertEquals(new User(), ls.validateLogin("", ""));
	}

}
