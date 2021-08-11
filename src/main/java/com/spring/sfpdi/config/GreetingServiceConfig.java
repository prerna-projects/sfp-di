package com.spring.sfpdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.sfpdi.services.ConstructorInjectedGreetingService;

@Configuration
public class GreetingServiceConfig {

	@Bean
	ConstructorInjectedGreetingService constructorInjectedGreetingService() {
		return new ConstructorInjectedGreetingService();
	}

}
