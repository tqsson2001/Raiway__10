package com.vti.testingsytem.entity;

public class Student extends User {
	
	private int id;
	public String clazz;

		
	public Student(String name, int age , String  calzz) {
		super(name, age);
		this.clazz = calzz;
	}
}
