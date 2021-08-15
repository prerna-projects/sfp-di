package com.spring.sfpdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.sfpdi.controllers.ConstructorBasedController;
import com.spring.sfpdi.controllers.MyController;
import com.spring.sfpdi.controllers.PetController;
import com.spring.sfpdi.controllers.PropertyInjectedController;
import com.spring.sfpdi.controllers.SetterBasedController;
import com.spring.sfpdi.datasource.FakeDataSource;
import com.spring.sfpdi.services.PrototypeBean;
import com.spring.sfpdi.services.SingletonBean;
import com.spring.sfpdi.controllers.I18nController;

@ComponentScan(basePackages = {"com.spring.sfpdi.*"})
public class SfpDiApplication {

	public static void main(String[] args) {
	
		ApplicationContext ctx = SpringApplication.run(SfpDiApplication.class, args);
		
		/*System.out.println("---------------------Profile Service---------------");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		
		System.out.println(i18nController.sayHello());
		
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
		
		
		System.out.println("----------------------Pet Service-------------------");
		
		PetController petController = (PetController)ctx.getBean("petController");
		System.out.println(petController.whichPetIsTheBest());
	
		System.out.println("---------------------Scope Test--------------------");
		
		SingletonBean singletonBean = (SingletonBean)ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean.getScope());
		

		SingletonBean singletonBean2 = (SingletonBean)ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getScope());
		
		PrototypeBean prototypeBean = (PrototypeBean)ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean.getScope());

		PrototypeBean prototypeBean2 = (PrototypeBean)ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getScope());
*/
		System.out.println("---------------------Fake Database Test--------------------");
		
		FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcurl());
		

		
	}

}

