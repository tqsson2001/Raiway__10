package com.vti.testingsytem.entity;

public class User {
	private String name;
	private int age;
	private String hometown;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println( "Init User.... ");
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getHometown() {
		return hometown;
	}


	public void setHometown(String hometown) {
		this.hometown = hometown;
	}	
}
