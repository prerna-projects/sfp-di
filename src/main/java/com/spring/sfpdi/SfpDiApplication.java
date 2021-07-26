package com.spring.sfpdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.sfpdi.controllers.MyController;

@SpringBootApplication
public class SfpDiApplication {

	public static void main(String[] args) {
	
		ApplicationContext ctx = SpringApplication.run(SfpDiApplication.class, args);
		
		MyController myController = (MyController)ctx.getBean("myController");
	
		String greetings = myController.sayHello();
		
		System.out.println(greetings);
	}

}
