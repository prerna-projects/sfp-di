package com.spring.sfpdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile ({"EN","default"})
@Service("i18nService")
public class i18nEnglishService implements GreetingService{

	@Override
	public String sayGreeting() {
		
		return "Hello World -- english";
	}

	
}
