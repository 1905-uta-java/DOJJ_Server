package com.moviereviews.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReviewServiceTest {
	
	ReviewService rs = new ReviewService();

	@Test
	public void testCreate() {
		assertEquals(-1, rs.create(null));
	}

	@Test
	public void testUpdate() {
		assertEquals(-1, rs.update(null));
	}


}
