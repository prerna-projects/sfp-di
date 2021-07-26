package com.spring.sfpdi.controllers;

import com.spring.sfpdi.services.GreetingService;

public class SetterBasedController {

	private GreetingService greetingService;
	
	public void setGreetingService(GreetingService greetingService) {
	
		this.greetingService = greetingService;
		
	}
	
	public String getGreeting() {
		
		return greetingService.sayGreeting();
	}
}
