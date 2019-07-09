package com.moviereviews.dao;

import java.util.List;

import com.moviereviews.models.Review;

public interface ReviewDao {

	public List<Review> getReviews();
	public List<Review> getReviewsByRecent();
	public List<Review> getReviewsByMovie(int mId);
	public List<Review> getReviewsByUser(String username);
	public Review getReviewById(int id);
	public int updateReview(Review r);
	public int createReview(Review r);
	public int deleteReview(int id);
}
