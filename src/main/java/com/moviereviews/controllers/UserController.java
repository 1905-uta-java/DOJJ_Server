package com.moviereviews.controllers;

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

import com.moviereviews.models.User;
import com.moviereviews.services.UserService;

@Controller
@CrossOrigin
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService us;
	
	//Mapping for Get by Username
	@GetMapping("/{username}")
	@ResponseBody
	public User getUserByUsername(@PathVariable("username") String un) {
		return us.getByUsername(un);
	}
	
	//Mapping for Post
	@PostMapping
	@CrossOrigin
	@ResponseBody
	public String addUser(@RequestBody User u) {
		us.create(u);
		return "Generated User";
	}
	
	//Mapping for Put
	@PutMapping
	@CrossOrigin
	@ResponseBody
	public String updateUser(@RequestBody User u) {
		us.update(u);
		return "User Successfully Updated";
	}
	
	//Mapping for Put
	@PutMapping("/change")
	@CrossOrigin
	@ResponseBody
	public String changePassword(@RequestBody User u) {
		int status = us.changePass(u);
		if(status == 0) {
			return "Success";
		}else {
			return "Failed";
		}
		
	}
	
	//Mapping for Put
	@PutMapping("/valid")
	@CrossOrigin
	@ResponseBody
	public String validPassword(@RequestBody User u) {
		int status = us.validPass(u);
		if(status == 0) {
			return "Valid";
		}else {
			return "Invalid";
		}
		
	}
	
	//Mapping for Delete
	@DeleteMapping("/{username}")
	@CrossOrigin
	@ResponseBody
	public String deleteUser(@PathVariable("username") String em) {
		us.delete(em);
		return "User Successfully Delete";
	}
	
}
