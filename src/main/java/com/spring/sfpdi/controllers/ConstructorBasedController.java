package com.spring.sfpdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring.sfpdi.services.GreetingService;

@Controller
public class ConstructorBasedController {

	private final GreetingService greetingService;

	
	public ConstructorBasedController(@Qualifier("constructorInjectedGreetingService")GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		
		return greetingService.sayGreeting();
	}
}
