package com.moviereviews.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moviereviews.dao.ReviewDao;
import com.moviereviews.dao.ReviewDaoImp;
import com.moviereviews.models.Review;

@Service
public class ReviewService {
	
	ReviewDao rd = new ReviewDaoImp();
	
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
		Review rev = rd.getReviewById(r.getId());
		rev.setUserScore(rev.getUserScore() + r.getUserScore());
		return rd.updateReview(rev);
	}
	
	//Delete a review by review id
	public int delete(int id) {
		//DELETE A REVIEW IN DB
		return rd.deleteReview(id);
	}

}
