package com.tz.test;

import java.text.MessageFormat;

public class Person {

	Integer age;

	String name;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void introduce() {
		System.out.println(MessageFormat.format("My name is {0},Im {1} years old", name, age));
	}
}
