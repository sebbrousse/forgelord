package com.forgelord.wicket;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

import com.forgelord.wicket.home.HomePage;

public class ForgeLordApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return HomePage.class;
	}

	@Override  
	protected void init() {  
		super.init();  
//		getResourceSettings().setUseDefaultOnMissingResource(false);  // rajouter tous les champs
//		getResourceSettings().setThrowExceptionOnMissingResource(true);  
	
		addComponentInstantiationListener(new SpringComponentInjector(this));
		
//		mountBookmarkablePage("/ListApplicationsPage", ListApplicationsPage.class);
//		mountBookmarkablePage("/ListFeaturesPage", ListFeaturesPage.class);
	}
	
	

}
