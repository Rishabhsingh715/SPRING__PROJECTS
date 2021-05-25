package com.seleniumexpress.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("Humanheart")
	private Heart heart;
   
	public Human(){
		
	}
	public Human(Heart heart) {
		
		this.heart = heart;
	}
   
	
	
	
	public void startPumping(){
		heart.pump();
	}

}
