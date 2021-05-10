package com.vti.testingsytem.entity;

public class HighSchool extends Student1 {
	private String lophoc;
	private String daihoc;
	
	public HighSchool(String name , int id , String lophoc , String daihoc) {
		super(name, id );
		this.lophoc = lophoc;
		this.daihoc = daihoc;
		System.out.println("Ra HighSchool...");
	}

	public String getLophoc() {
		return lophoc;
	}

	public void setLophoc(String lophoc) {
		this.lophoc = lophoc;
	}

	public String getDaihoc() {
		return daihoc;
	}

	public void setDaihoc(String daihoc) {
		this.daihoc = daihoc;
	}
	
	
}
