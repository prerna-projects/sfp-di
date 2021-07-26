package com.spring.sfpdi.controllers;

import com.spring.sfpdi.services.GreetingService;

public class ConstructorBasedController {

	private final GreetingService greetingService;

	public ConstructorBasedController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		
		return greetingService.sayGreeting();
	}
}
