package com.spring.beanScopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeScope {
	
	 public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("prototypeScopeBeans.xml");
	      PrototypeScopeEntity objA = (PrototypeScopeEntity) context.getBean("PrototypeScope");

	      objA.setMessage("I'm object A");
	      objA.getMessage();

	      PrototypeScopeEntity objB = (PrototypeScopeEntity) context.getBean("PrototypeScope");
	      objB.getMessage();
	   }

}
