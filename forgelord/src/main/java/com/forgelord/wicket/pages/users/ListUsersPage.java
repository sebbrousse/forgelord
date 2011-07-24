package com.forgelord.wicket.pages.users;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
import org.apache.wicket.spring.injection.annot.SpringBean;

import com.forgelord.model.User;
import com.forgelord.repositories.UserRepository;
import com.forgelord.wicket.pages.BasePage;


public class ListUsersPage extends BasePage {

	@SpringBean
	private UserRepository userRepo;
	
	
    public ListUsersPage() {
    	super();

    	add(new PropertyListView<User>("users", userRepo.findAll()) {

			@Override
			protected void populateItem(ListItem<User> item) {
				User user = item.getModelObject();
				item.add(new Label("fullName", user.getFullName()));
			}
    		
    	});
    }

}
