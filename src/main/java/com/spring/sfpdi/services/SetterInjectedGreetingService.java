package com.spring.sfpdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService{

	public String sayGreeting() {

		return "Hi People -- setter ";
	}

	
}
