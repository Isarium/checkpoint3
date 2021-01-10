package com.wcsCheckpoint3.checkpoint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcsCheckpoint3.checkpoint3.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
