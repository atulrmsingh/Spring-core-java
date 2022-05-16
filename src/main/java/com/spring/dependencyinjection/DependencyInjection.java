package com.spring.dependencyinjection;

public class DependencyInjection {
	String name;
	int age;
	public DependencyInjection(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
public void getDetails() {
		
		System.out.println("Hello "+ name+ " your age is  "+ age );
		
	}

}
