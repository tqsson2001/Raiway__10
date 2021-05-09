package com.vti.testingsytem.entity;

public class New implements INew {
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;	
	
	
	public int getid() { return id; }
	public String gettitle() { return title; }
	public String getpublishDate() { return publishDate; }
	public String getauthor() { return author; }
	public String getcontent() { return content; }
	public float getaverageRate() { return averageRate; }
	
	public void setid( int id) { this.id = id;}
	public void settitle( String title) { this.title = title;}
	public void setpublishDate( String publishDate) { this.publishDate = publishDate;}
	public void setauthor ( String author) { this.author = author;}
	public void setcontent ( String content) { this.content = content;}

	public void Display() {
		System.out.println("Title : " + title);
		System.out.println("PublishDate : " + publishDate);
		System.out.println("Author : " + author);
		System.out.println("Content : " + content);
		System.out.println("AverageRate : " + averageRate);
	}
	

	public float Calculate() { return 0;}
	
	
}
