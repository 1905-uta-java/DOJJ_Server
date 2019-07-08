package com.moviereviews.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

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
@CrossOrigin
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
	@ResponseBody
	public String addReview(@RequestBody Review r, HttpServletResponse response) {
		rs.create(r);
		response.setStatus(201);
		return "Created";
	}
	
	//Mapping for Put
	@PutMapping
	public String updateReview(@RequestBody Review r) {
		rs.update(r);
		return "Review Successfully Updated";
	}
	
	//Mapping for Delete By Id
	@DeleteMapping("/{id}")
	public String deleteReview(@PathVariable("id") int id) {
		rs.delete(id);
		return "Review Successfully Delete";
	}

}

