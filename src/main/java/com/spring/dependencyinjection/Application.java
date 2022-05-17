package com.spring.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjectionBeans.xml");
		DependencyInjection didemo = (DependencyInjection)context.getBean("a");
		didemo.getDetails();
		DependencyInjectionUsingSetter di = context.getBean("b", DependencyInjectionUsingSetter.class);
		di.printInfo();
	}

}
