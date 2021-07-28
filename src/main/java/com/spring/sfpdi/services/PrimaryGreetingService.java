package com.spring.sfpdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

	public String sayGreeting() {

		return "Hi People -- Primary Bean ";
	}

	
}
