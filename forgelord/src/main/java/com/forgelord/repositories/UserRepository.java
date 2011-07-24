package com.forgelord.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forgelord.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}

