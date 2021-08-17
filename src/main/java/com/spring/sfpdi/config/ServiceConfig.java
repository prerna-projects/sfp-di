package com.spring.sfpdi.config;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.spring.sfpdi.datasource.FakeDataSource;
import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;

@ConfigurationPropertiesScan
@Configuration
public class ServiceConfig {

	@Bean
	FakeDataSource fakeDataSource(SfpPropertyConfig sfpPropertyConfig) {
		
		FakeDataSource fakeDataSource = new FakeDataSource();
		
		fakeDataSource.setUsername(sfpPropertyConfig.getUsername());
		fakeDataSource.setPassword(sfpPropertyConfig.getPassword());
		fakeDataSource.setJdbcurl(sfpPropertyConfig.getJdbcurl());
		
		return fakeDataSource;
	}
	
	
	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}
	
	
	@Profile({"dog","default"})
	@Bean
	PetService dogPetService() {
		return new PetServiceFactory().getPetService("dog");
	}
	
	@Profile("Cat")
	@Bean
	PetService catPetService() {
		return new PetServiceFactory().getPetService("cat");	}
	

}
