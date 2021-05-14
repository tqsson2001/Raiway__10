package com.tvi.testing.Entity;

public class Group_3 extends Student {
	public Group_3(int id, String name, int group) {
		super(id, name, group);
	}

	@Override
	public void diemDanh() {
		System.out.println( "Diem danh Student Group3");
	}

	@Override
	public void hocBai() {
		System.out.println("Student Group3 dang hoc bai");
	}

	@Override
	public void diDonVeSinh() {
		System.out.println("Student Group3 dang don ve sinh");			
	}
	
	@Override
	public int luong() {
		return 500;
	}
}
