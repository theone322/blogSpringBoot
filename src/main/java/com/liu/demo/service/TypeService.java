package com.liu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liu.demo.entity.Type;
import com.liu.demo.repository.TypeRepository;

@Service
public class TypeService {
	@Autowired   //  自动导入
	private TypeRepository typeRepository;

	public Type addType(Type type) {
		return typeRepository.save(type);
	}
	
	
}


	
	