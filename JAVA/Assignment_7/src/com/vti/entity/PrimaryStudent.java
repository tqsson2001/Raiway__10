package com.vti.entity;

public class PrimaryStudent extends HocSinh {
	
	public static int COUNTPrimary = 0;
	
	public PrimaryStudent(int id, String name) {
		super(id, name);
		COUNTPrimary++;
	}
}
