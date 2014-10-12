package com.test;

import com.test.entity.Student;

public class HelloWorld {

	public String sayHello() {
		return "saying hellooooooooooooo----2----";
	}
	
	public Student query() {
		Student s = new Student();
		s.setId("1");
		s.setName("wsc123");
		return s;
	}
	
	public Integer addTowNumbers(int a, int b) {
		return a+b;
	}
}
