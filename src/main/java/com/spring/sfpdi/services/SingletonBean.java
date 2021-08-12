package com.spring.sfpdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

	public SingletonBean() {
		System.out.println("Creating Singleton Bean");
	}
	
	public String getScope() {
		return "I am singleton bean..........";
	}
}
