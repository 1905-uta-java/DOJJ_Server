package com.moviereviews.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moviereviews.models.Reviews;

@Service
public class ReviewsService {
	
	//Get all the reviews by the movie Id
	public List<Reviews> getByMovieId(int id) {
		//GET REVIEWS FROM DB WITH MOVIE ID
		return null;
	}
	
	//Create a new review
	public int create(Reviews r) {
		//CREATE A NEW REVIEW TO DB
		return 0;
	}
	
	//Update a reviews information/score
	public int update(Reviews r) {
		//UPDATE A REVIEW IN DB
		return 0;
	}
	
	//Delete a review by review id
	public int delete(int id) {
		//DELETE A REVIEW IN DB
		return 0;
	}

}
