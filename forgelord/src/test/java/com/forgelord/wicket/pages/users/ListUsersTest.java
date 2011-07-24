package com.forgelord.wicket.pages.users;

import org.junit.Test;

import com.forgelord.test.wicket.AbstractWicket;

public class ListUsersTest extends AbstractWicket {

	@Test
	public void shouldHaveATitle() {
		tester.startPage(ListUsersPage.class);
		tester.assertRenderedPage(ListUsersPage.class);
	}


}



