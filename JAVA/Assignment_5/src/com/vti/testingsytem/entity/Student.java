package com.vti.testingsytem.entity;

public class Student extends User {
	
	private int msv;
	public String lop;
	
	public Student(String name, int age, String lop) {
		super(name, age);
		this.lop = lop;
		System.out.println("Init Student...");
	}
}
