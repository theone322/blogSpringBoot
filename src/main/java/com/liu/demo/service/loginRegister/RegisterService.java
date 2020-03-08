package com.liu.demo.service.loginRegister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liu.demo.entity.User;
import com.liu.demo.repository.UserRepository;

@Service
public class RegisterService {
	
	@Autowired   //  自动导入
	private UserRepository userRepository;
	
	
	public User addUser(User user) {
		return userRepository.save(user);
	}

}
