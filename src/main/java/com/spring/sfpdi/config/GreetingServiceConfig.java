package com.spring.sfpdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springframework.pets.CatPetService;
import com.springframework.pets.DogPetService;
import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;


@Configuration
public class GreetingServiceConfig {

	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}
	
	
	@Profile({"dog","deafult"})
	@Bean
	PetService dogPetService() {
		return new PetServiceFactory().getPetService("dog");
	}
	
	@Profile("Cat")
	@Bean
	PetService catPetService() {
		return new PetServiceFactory().getPetService("cat");	}
	

}
