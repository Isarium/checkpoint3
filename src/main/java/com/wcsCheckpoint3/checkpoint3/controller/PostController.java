package com.wcsCheckpoint3.checkpoint3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wcsCheckpoint3.checkpoint3.entity.Post;


@CrossOrigin(origins = "https://javangular-checkpoint3.jsrover.wilders.dev", maxAge = 3600)
@RestController
@RequestMapping("/feed")


public class PostController {
	
	@Autowired
	private PostController PostService;
	
	
	@RequestMapping(path ="api/post", method = RequestMethod.GET )
	public List<Post> getPosts() {
		return PostService.getPosts();
	}

}
