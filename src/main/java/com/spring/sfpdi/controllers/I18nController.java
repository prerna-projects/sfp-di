package com.spring.sfpdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring.sfpdi.services.GreetingService;

@Controller
public class I18nController {
	
	private final GreetingService greetingService;
	
	public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
		
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		
		return greetingService.sayGreeting();
	}
}
