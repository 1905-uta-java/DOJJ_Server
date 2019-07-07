package com.moviereviews.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moviereviews.models.User;
import com.moviereviews.services.LoginService;

@Controller
@CrossOrigin(origins = "http://moviereviewsdojj.s3-website.us-east-2.amazonaws.com")
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService ls;
	
	//Mapping for Post
	@PostMapping
	@ResponseBody
	public User login(@RequestBody User u) {
		return ls.validateLogin(u.getEmail(), u.getPassword());
	}

}
