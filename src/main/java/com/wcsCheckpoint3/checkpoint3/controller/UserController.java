package com.wcsCheckpoint3.checkpoint3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wcsCheckpoint3.checkpoint3.entity.User;
import com.wcsCheckpoint3.checkpoint3.service.UserService;


@CrossOrigin(origins = "https://javangular-checkpoint3.jsrover.wilders.dev", maxAge = 3600)
@RestController
@RequestMapping("/users")

	
	
	public class UserController {
		
		@Autowired
		private UserController UserService;
		
		
		@RequestMapping(path ="api/users", method = RequestMethod.GET )
		public List<User> getUsers() {
			return UserService.getUsers();
		}

}
	
	
