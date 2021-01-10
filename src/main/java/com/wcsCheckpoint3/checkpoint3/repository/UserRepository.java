package com.wcsCheckpoint3.checkpoint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wcsCheckpoint3.checkpoint3.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
