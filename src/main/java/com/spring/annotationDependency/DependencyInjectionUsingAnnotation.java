package com.spring.annotationDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionUsingAnnotation {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("annotationBeans.xml");
		Person person = context.getBean("person", Person.class);
		person.pumping();

	}

}
