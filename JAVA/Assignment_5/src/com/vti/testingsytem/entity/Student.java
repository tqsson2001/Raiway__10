package com.vti.testingsytem.entity;

public class Student extends User implements IStudy, IFamily, IGame {
	
	private int msv;
	public String lop;
	
	public Student(String name, int age, String lop) {
		super(name, age);
		this.lop = lop;
		System.out.println("Init Student...");
	}
	
	public void diemDanh() {}
	public void lamBai() {}
	public void thiCu() {}
	
	public void nauCom() {}
	
	public void choiGame() {}
	public void choiLo() {}

	public void thamQue() {}
}
