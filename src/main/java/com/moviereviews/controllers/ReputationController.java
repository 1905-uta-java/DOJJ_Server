package com.moviereviews.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moviereviews.models.UserAndReview;
import com.moviereviews.services.ReviewService;
import com.moviereviews.services.UserService;

@Controller
@CrossOrigin
@RequestMapping("/rep")
public class ReputationController {
	@Autowired
	private UserService us;
	
	@Autowired
	private ReviewService rs;
	
	//Mapping for Put
	@PutMapping
	@ResponseBody
	public String updateUser(@RequestBody UserAndReview ur) {
		us.update(ur.getU());
		rs.update(ur.getR());
		return "Successfully Updated";
	}

}
