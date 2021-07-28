package com.spring.sfpdi.controllers;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.spring.sfpdi.services.ConstructorInjectedGreetingService;

class SetterBasedControllerTest {
	
    SetterBasedController controller;
	@BeforeEach
	void setUp() throws Exception {
		
		controller = new SetterBasedController();
		
		controller.setGreetingService( new ConstructorInjectedGreetingService());
	}

	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreeting());
		//fail("Not yet implemented");
	}

}
