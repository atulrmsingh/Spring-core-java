package com.spring.beanScopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonScope {
	
	 public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("singletonScopeBeans.xml");
	      SingletonScopeEntity objA = (SingletonScopeEntity) context.getBean("SingletonScope");

	      objA.setMessage("I'm object A");
	      objA.getMessage();

	      SingletonScopeEntity objB = (SingletonScopeEntity) context.getBean("SingletonScope");
	      objB.getMessage();
	   }

}
