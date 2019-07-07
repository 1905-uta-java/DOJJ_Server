package com.moviereviews.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "http://moviereviewsdojj.s3-website.us-east-2.amazonaws.com")
@RequestMapping("/review")
public class ReviewController {
	
	@Autowired
	private ReviewService rs;
	
	//Mapping for Get by Id
	@CrossOrigin(origins = "http://moviereviewsdojj.s3-website.us-east-2.amazonaws.com")
	@GetMapping("/{id}")
	@ResponseBody
	public List<Review> getReviewsByMovieId(@PathVariable("id") int mId) {
		return rs.getByMovieId(mId);
	}
	
	//Mapping for Post
	@PostMapping
	@ResponseBody
	public String addReview(@RequestBody Review r) {
		rs.create(r);
		return "Reveiw Successfully Added";
	}
	
	//Mapping for Put
	@PutMapping
	@ResponseBody
	public String updateReview(@RequestBody Review r) {
		rs.update(r);
		return "Review Successfully Updated";
	}
	
	//Mapping for Delete By Id
	@DeleteMapping("/{id}")
	@ResponseBody
	public String deleteReview(@PathVariable("id") int id) {
		rs.delete(id);
		return "Review Successfully Delete";
	}

}

