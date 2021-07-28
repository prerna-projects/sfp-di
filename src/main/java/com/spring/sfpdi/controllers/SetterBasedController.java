package com.spring.sfpdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.sfpdi.services.GreetingService;

@Controller
public class SetterBasedController {

	@Autowired
	private GreetingService greetingService;
	
	public void setGreetingService(GreetingService greetingService) {
	
		this.greetingService = greetingService;
		
	}
	
	public String getGreeting() {
		
		return greetingService.sayGreeting();
	}
}
