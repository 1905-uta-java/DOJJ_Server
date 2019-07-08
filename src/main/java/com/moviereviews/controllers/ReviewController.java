package com.moviereviews.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moviereviews.models.Review;
import com.moviereviews.services.ReviewService;

@Controller
@RequestMapping("/review")
public class ReviewController {
	
	@Autowired
	private ReviewService rs;
	
	//Mapping for Get by Id
	@GetMapping("/{id}")
	@ResponseBody
	public List<Review> getReviewsByMovieId(@PathVariable("id") int mId) {
		return rs.getByMovieId(mId);
	}
	
	//Mapping for Post
	@PostMapping
	public int addReview(@RequestBody Review r) {
		return rs.create(r);
	}
	
	//Mapping for Put
	@PutMapping
	public int updateReview(@RequestBody Review r) {
		return rs.update(r);
	}
	
	//Mapping for Delete By Id
	@DeleteMapping("/{id}")
	public int deleteReview(@PathVariable("id") int id) {
		return rs.delete(id);
	}

}

