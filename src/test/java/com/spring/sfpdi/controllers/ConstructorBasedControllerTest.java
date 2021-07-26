package com.spring.sfpdi.controllers;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.spring.sfpdi.services.GreetingServiceImpl;

class ConstructorBasedControllerTest {
	
	ConstructorBasedController controller;
	@BeforeEach
	void setUp() throws Exception {
		
		controller = new ConstructorBasedController(new GreetingServiceImpl());
	}

	@Test
	void g() {
		
		System.out.println(controller.getGreeting());
		//fail("Not yet implemented");
	}

}
