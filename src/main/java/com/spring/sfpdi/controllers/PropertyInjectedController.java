package com.spring.sfpdi.controllers;

import com.spring.sfpdi.services.GreetingService;

public class PropertyInjectedController {

	public GreetingService greetingService;
	
	public String getGreeting() {
	
		return greetingService.sayGreeting();
	}
}
