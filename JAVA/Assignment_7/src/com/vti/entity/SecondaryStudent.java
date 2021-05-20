package com.vti.entity;

public class SecondaryStudent extends HocSinh {

	public static int COUNTSeconday = 0;
	
	public SecondaryStudent(int id, String name) {
		super(id, name);
		COUNTSeconday++;
	}

}
