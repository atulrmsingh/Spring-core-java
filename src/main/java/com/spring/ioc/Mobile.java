package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("iocbeans.xml");
		Sim sim = context.getBean("sim", Sim.class);
		sim.call();
		sim.data();
	}
	
	

}
