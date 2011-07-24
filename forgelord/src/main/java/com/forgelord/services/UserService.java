package com.forgelord.services;

import com.forgelord.model.User;
import com.forgelord.repositories.UserRepository;

public class UserService {

	private UserRepository userRepository;
	
	public void add(User user) {
		userRepository.save(user);
	}
}
