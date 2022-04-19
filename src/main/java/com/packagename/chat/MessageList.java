package com.packagename.chat;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;


//view and listing 
public class MessageList extends Div{

	public MessageList(){
		addClassName("message-list");
	}
	
	// adding components 
	@Override
	public void add(Component... components) {
		super.add(components);
		components[components.length-1].getElement().callFunction("scrollIntoView");
	}
}
