package com.vti.testingsytem.entity;

public class User {
	String name;
	int age;
	String hometown;
	
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	} 
	
	public String getname() {return name;}
	public int getage() { return age;}
}
