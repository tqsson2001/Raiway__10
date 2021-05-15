package com.vti.entity;

public class Hoc_Sinh  {
	private int id;
	private String name;
	public static String college = "Dai Hoc Bach Khoa";
	
	public Hoc_Sinh(int id, String name) {
		this.id = id;
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Student{" + " id = " + id + ", name = '" + name +"'" + ", college = '" + college + "'}"; 
	}
	
}
