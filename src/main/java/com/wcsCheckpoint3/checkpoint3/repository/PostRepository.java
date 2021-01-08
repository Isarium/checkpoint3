package com.wcsCheckpoint3.checkpoint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcsCheckpoint3.checkpoint3.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
