package com.moviereviews.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.moviereviews.models.User;

public class UserServiceTest {
	
	UserService us = new UserService();

	@Test
	public void testGetByUsername() {
		assertEquals(new User(), us.getByUsername(null));
		assertEquals(new User(), us.getByUsername(""));
	}

	@Test
	public void testUpdate() {
		assertEquals(-1, us.update(null));
	}

	@Test
	public void testDelete() {
		assertEquals(-1, us.delete(null));
		assertEquals(-1, us.delete(""));
	}

}
