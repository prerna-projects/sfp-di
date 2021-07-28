package com.spring.sfpdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.sfpdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
	@Autowired
	public GreetingService greetingService;
	
	public String getGreeting() {
	
		return greetingService.sayGreeting();
	}
}
