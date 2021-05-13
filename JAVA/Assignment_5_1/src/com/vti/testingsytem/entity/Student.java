package com.vti.testingsytem.entity;

public abstract class Student implements IStudent  {
	private int id;
	private String name;
	private int group;

	public Student(int id, String name, int group) {
		this.id = id;
		this.name = name;
		this.group = group;
	}


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



	public int getGroup() {
		return group;
	}



	public void setGroup(int group) {
		this.group = group;
	}	
	
	
	
	public float sum( double a , double b) {
		return (float) ( a + b );
	}
	
	
	public int sum( int a , int b  ) {
		return ( a + b);
	}
	
	
	public long sum( long a , int b ) {
		return ( a + b);
	}
	
	
	public int luong() {
		return 1000;
	}
	
	
	
	
	
	
}
