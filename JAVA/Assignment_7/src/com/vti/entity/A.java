package com.vti.entity;

public class A {
	public static int count = 0;
	String name;
	public String tuoi;
	
	public A(String name) {
		count++;
		this.name = name;
	}
	
	
	
	public String toString() {
		return "count = " + count + ", name = " + name;
	}
	
}
