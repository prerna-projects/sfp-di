package com.spring.sfpdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.spring.sfpdi.datasource.FakeDataSource;
import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;

@PropertySource("classpath:datasource.properties")
@Configuration
public class ServiceConfig {

	@Bean
	FakeDataSource fakeDataSource(@Value("${jdbc.username}")String username, 
								  @Value("${jdbc.password}")String password, 
								  @Value("${jdbc.jdbcurl}")String jdbcurl) {
		
		FakeDataSource fakeDataSource = new FakeDataSource();
		
		fakeDataSource.setUsername(username);
		fakeDataSource.setPassword(password);
		fakeDataSource.setJdbcurl(jdbcurl);
		
		return fakeDataSource;
	}
	
	
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
