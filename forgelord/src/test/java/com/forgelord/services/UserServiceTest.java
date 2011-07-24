package com.forgelord.services;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.forgelord.model.User;
import com.forgelord.repositories.UserRepository;
import com.forgelord.services.UserService;

public class UserServiceTest {

	@Before
	public void initMock() {
		MockitoAnnotations.initMocks(this);
	}
	
	@InjectMocks
	private UserService userService = new UserService();
	@Mock
	private UserRepository userRepo;
	
	@Test
	public void addShouldSaveTheUser() {
		User user = new User();
		
		userService.add(user);
		
		verify(userRepo).save(user);
	}
}
