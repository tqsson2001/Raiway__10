package com.vti.entity;

public class HocSinh  {
	private  int id;
	private String name;
	public static String college = "Dai Hoc Bach Khoa";
	public static int money  ;
	public static int COUNT = 0;
	
	public HocSinh(int id, String name) {
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
		return "Student{" + " id = " + id + ", name = '" + name +"'" + ", college = '" + college + ", quy lop ='" + money + "'}";                  
	}

	public void setMoney(int money) {
		HocSinh.money += money;
	}

	public void settieutien ( int money) {
		HocSinh.money -= money;
	}
	
	
}
