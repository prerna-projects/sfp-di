package com.spring.sfpdi.repository;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRespository{

	public final EnglishGreetingRespository englishGreetingRespository;
	
	
	public EnglishGreetingRepositoryImpl(EnglishGreetingRespository englishGreetingRespository) {
		super();
		this.englishGreetingRespository = englishGreetingRespository;
	}


	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Hello World -- en";
	}

}
