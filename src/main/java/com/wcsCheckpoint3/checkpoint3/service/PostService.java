package com.wcsCheckpoint3.checkpoint3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcsCheckpoint3.checkpoint3.entity.Post;
import com.wcsCheckpoint3.checkpoint3.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	PostRepository postRepository; 
	
	public List<Post> getPosts() {
		
		return postRepository.findAll();
	
	}

}
