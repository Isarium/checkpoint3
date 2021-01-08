package com.wcsCheckpoint3.checkpoint3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wcsCheckpoint3.checkpoint3.entity.User;
import com.wcsCheckpoint3.checkpoint3.repository.UserRepository;

	@Service
	public class UserService {
		
		@Autowired
		UserRepository userRepository; 
		
		public List<User> getUsers() {	
			return userRepository.findAll();
		}

	}

