package com.vti.testingsytem.entity;

public class MyMath {
	private int id ;
	private String name ;
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public MyMath(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}




	public int sum( int a , int b) {
		return ( a + b);
	}

}
