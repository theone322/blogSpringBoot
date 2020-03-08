package com.liu.demo.service.loginRegister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liu.demo.entity.User;
import com.liu.demo.repository.UserRepository;

@Service
public class LoginService {

	
	
	@Autowired   //  自动导入
	private UserRepository userRepository;
	
	
	public User checkUser(User user) {
		
		return userRepository.getOne(user.getUserID());
	}
}
