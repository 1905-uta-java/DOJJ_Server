package com.moviereviews.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserServiceTest {
	
	UserService us = new UserService();

	@Test
	public void testGetByUsername() {
		assertEquals(-1, us.getByUsername(null));
		assertEquals(-1, us.getByUsername(""));
	}

	@Test
	public void testCreate() {
		assertEquals(-1, us.create(null));
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
