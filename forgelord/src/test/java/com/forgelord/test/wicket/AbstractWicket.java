package com.forgelord.test.wicket;

import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.apache.wicket.spring.test.ApplicationContextMock;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.mockito.MockitoAnnotations;

public class AbstractWicket {

	protected WicketTester tester;  
	protected ApplicationContextMock ctx;
	
	@Before
	public void setUp() {
		//Mock init
		MockitoAnnotations.initMocks(this);

		//Wicket Tester Init
		tester = new WicketTester();  
		
		//Wicket-Spring Init
		ctx = new ApplicationContextMock();
		tester.getApplication().addComponentInstantiationListener(new SpringComponentInjector(
				tester.getApplication(),ctx,true
		));
	}
}
