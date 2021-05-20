package com.vti.testingsytem.entity;

public class News implements INew {
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	
	private int[] rate = { 5 , 10 ,15};
	
	
	
	
	public int[] getRate() {
		return rate;
	}

	public void setRate(int[] rate) {
		this.rate = rate;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getPublishDate() {
		return publishDate;
	}
	
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public float getAverageRate() {
		return averageRate;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public void Display() {
		System.out.println( " Title : " + title);
		System.out.println( " PublishDate : " + publishDate );
		System.out.println( " Author : " + author);
		System.out.println( " Content : " + content);
		System.out.println( " AverageRate : " + averageRate);
//			System.out.println(	getTitle());
	}
	

	@Override
	public float Calculate() {
		averageRate = (float) ((rate[0] + rate[1] + rate[2]) / 3);
		return averageRate;
	}



}
