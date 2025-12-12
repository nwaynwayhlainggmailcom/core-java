package com.jdc.library;

public class Book {
	private String title;
	private String author;
	private int year;
	public Book(String title, String author, int year) {
		
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public String getDetails() {
		return title + "by" + author + "("+year+")";
	}
	
	

}
