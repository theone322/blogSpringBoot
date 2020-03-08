package com.liu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.liu.demo.entity.User;
import com.liu.demo.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping("/addUser")
	public String addUser() {
		return "addUser";
	}
	
	@PostMapping("/addUser")
	public String addUser(User user) {
		userService.addUser(user);
		return "result";
		
	}
	
	
	
}



