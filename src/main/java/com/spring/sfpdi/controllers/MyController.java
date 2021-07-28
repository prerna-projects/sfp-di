package com.spring.sfpdi.controllers;

import org.springframework.stereotype.Controller;

import com.spring.sfpdi.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetingService;
	
	public  MyController(GreetingService greetingService) {
		
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
				
		return greetingService.sayGreeting();
	}
}
