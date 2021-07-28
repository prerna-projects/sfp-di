package com.spring.sfpdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

	public String sayGreeting() {

		return "Hi People";
	}

	
}
