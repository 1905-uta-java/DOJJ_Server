package com.moviereviews.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moviereviews.models.User;
import com.moviereviews.services.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService ls;
	
	//Mapping for Post
	@PostMapping
	@ResponseBody
	public String login(@RequestBody User u) {
		ls.validateLogin(u.getEmail(), u.getPassword());
		return "Reveiw Successfully Added";
	}

}
