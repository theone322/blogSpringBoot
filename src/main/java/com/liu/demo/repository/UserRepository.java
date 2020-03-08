package com.liu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liu.demo.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	
}
