package com.spring.sfpdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.sfpdi.controllers.ConstructorBasedController;
import com.spring.sfpdi.controllers.MyController;
import com.spring.sfpdi.controllers.PropertyInjectedController;
import com.spring.sfpdi.controllers.SetterBasedController;

@SpringBootApplication
public class SfpDiApplication {

	public static void main(String[] args) {
	
		ApplicationContext ctx = SpringApplication.run(SfpDiApplication.class, args);
		
		System.out.println("--------------------Primary Bean------------------");
		MyController myController = (MyController)ctx.getBean("myController");
		
		System.out.println(myController.getGreeting());
		
		System.out.println("--------------------Property Based-----------------");
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("--------------------Setter Based-----------------");
		
		SetterBasedController setterBasedController = (SetterBasedController) ctx.getBean("setterBasedController");
		System.out.println(setterBasedController.getGreeting());
		
		System.out.println("--------------------Constructor Based-----------------");
		
		ConstructorBasedController constructorBasedController = (ConstructorBasedController) ctx.getBean("constructorBasedController");
		System.out.println(constructorBasedController.getGreeting());
	}

}
