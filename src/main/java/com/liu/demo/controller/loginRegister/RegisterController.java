package com.liu.demo.controller.loginRegister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.liu.demo.entity.User;
import com.liu.demo.service.loginRegister.RegisterService;

@Controller
public class RegisterController {


	@Autowired
	private RegisterService registerService;
	
	//注册
	@GetMapping("/register")
	public String addUser() {
		return "loginRegister/register";
	}
	
	@PostMapping("/register")
	public String addUser(User user) {
		System.out.println("register post");
		registerService.addUser(user);
		return "loginRegister/registerSuccess";
		
	}
	
	
}
