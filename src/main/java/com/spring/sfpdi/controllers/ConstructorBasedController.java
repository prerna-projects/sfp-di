package com.spring.sfpdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.sfpdi.services.GreetingService;

@Controller
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
