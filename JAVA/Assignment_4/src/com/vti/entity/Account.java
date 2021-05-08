package com.vti.entity;

public class Account {
	private	int 	id;
	private String 	name;
	private String 	userName;
	private String	fullName;
	
	public Account ( int id , String name , String userName , String fullName ) {
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.fullName = fullName;	
	}
	
	public int getID() { return id; }
	public String getname() { return name; }
	public String getuserName() { return userName;}
	public String getfullName() { return fullName;}
	
	
	
	
}
