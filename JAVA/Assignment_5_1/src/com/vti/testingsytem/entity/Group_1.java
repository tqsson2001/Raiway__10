package com.vti.testingsytem.entity;

public class Group_1 extends Student {
	public Group_1(int id, String name, int group) {
		super(id, name, group);
	}

	@Override
	public void diemDanh() {
		System.out.println( "Diem danh Student Group1");
	}

	@Override
	public void hocBai() {
		System.out.println("Student Group1 dang hoc bai");
	}

	@Override
	public void diDonVeSinh() {
		System.out.println("Student Group1 dang don ve sinh");			
	}
}
