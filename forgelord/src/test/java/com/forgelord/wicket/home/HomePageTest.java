package com.forgelord.wicket.home;

import org.junit.Test;

import com.forgelord.test.wicket.AbstractWicket;

public class HomePageTest extends AbstractWicket {

	@Test
	public void shouldHaveHomeForTitle() {
		tester.startPage(HomePage.class);
		tester.assertRenderedPage(HomePage.class);
	}


}



