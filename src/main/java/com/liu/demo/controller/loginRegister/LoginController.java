package com.liu.demo.controller.loginRegister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.liu.demo.entity.User;
import com.liu.demo.service.loginRegister.LoginService;

@Controller
public class LoginController {

	
	@Autowired
	private LoginService loginService ;
	
	//注册
	@GetMapping("/login")
	public String addUser() {
		return "loginRegister/login";
	}
	
	@PostMapping("/login")
	public String addUser(User user) {
		System.out.println("login post");
		//registerService.addUser(user);
		return "index/index";
		
	}
	
	
	
}
