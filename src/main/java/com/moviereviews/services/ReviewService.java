package com.moviereviews.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviereviews.dao.ReviewDaoImp;
import com.moviereviews.models.Review;

@Service
public class ReviewService {
	
	@Autowired
	ReviewDaoImp rd;
	
	//Get all the reviews by the movie Id
	public List<Review> getByMovieId(int id) {
		//GET REVIEWS FROM DB WITH MOVIE ID
		return rd.getReviewsByMovie(id);
	}
	
	//Create a new review
	public int create(Review r) {
		//CREATE A NEW REVIEW TO DB
		return rd.createReview(r);
	}
	
	//Update a reviews information/score
	public int update(Review r) {
		//UPDATE A REVIEW IN DB
		return rd.updateReview(r);
	}
	
	//Delete a review by review id
	public int delete(int id) {
		//DELETE A REVIEW IN DB
		return rd.deleteReview(id);
	}

}
