package com.vti.testingsytem.entity;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
		System.out.println("Ra Person...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
	