package com.spring.dependencyinjection;

public class DependencyInjectionUsingSetter {
	private String Name;
	private int Age;

	public void setName(String name) {
		Name = name;
	}

	public void setAge(int age) {
		Age = age;
	}

	public void printInfo() {
		System.out.println("Name is " + Name + " age is " + Age);
	}

}
