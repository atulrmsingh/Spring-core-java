package com.spring.annotationDependency;

public class Person {
	Heart heart;

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void pumping() {
		if(heart != null) {
		
		heart.pump();
	}else {
		System.out.println("you are dead");
	}
		
	}
}
