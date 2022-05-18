package com.spring.annotationDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	@Autowired
	@Qualifier("heartObject1")
	Heart heart;

	public void pumping() {
		if (heart != null) {

			heart.pump();
		} else {
			System.out.println("you are dead");
		}

	}
}
