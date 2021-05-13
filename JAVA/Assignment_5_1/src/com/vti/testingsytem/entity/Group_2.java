package com.vti.testingsytem.entity;

public class Group_2 extends Student {
	public Group_2(int id, String name, int group) {
		super(id, name, group);
	}

	@Override
	public void diemDanh() {
		System.out.println( "Diem danh Student Group2");
	}

	@Override
	public void hocBai() {
		System.out.println("Student Group2 dang hoc bai");
	}

	@Override
	public void diDonVeSinh() {
		System.out.println("Student Group2 dang don ve sinh");			
	}
	
	@Override
	public int luong() {
		return super.luong() + 500;
	}
}
