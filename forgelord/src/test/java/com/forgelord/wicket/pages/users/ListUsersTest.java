package com.forgelord.wicket.pages.users;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.forgelord.repositories.UserRepository;
import com.forgelord.test.wicket.AbstractWicket;

public class ListUsersTest extends AbstractWicket {

	@Mock
	private UserRepository userRepo;
	
	@Before  
	public void setup() {
		ctx.putBean(userRepo);
	}  
	
	@Test
	public void shouldHaveATitle() {
		tester.startPage(ListUsersPage.class);
		tester.assertRenderedPage(ListUsersPage.class);
	}


}



