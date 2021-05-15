package com.vti.entity;

public class Student {
	private static final String ScannerUltis = null;
	private int id;
	private String name;
	public static String collect = "Dai Hoc Bach Khoa" ;
	private static int COUNT = 0;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.id = ++COUNT;
		System.out.println( "Nhap Ten Sinh Vien");
		this.name = ScannerUltis.toString();
		
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return " Student [ id = " + id + ", name = " + name + " collect : " + collect + "]" ;
		
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

	public static String getCllect() {
		return collect;
	}

	public static void setCllect(String cllect) {
		Student.collect = collect;
	}


	
}
