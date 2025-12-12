package com.jdc.io_streams;

import java.util.Date;

public class User {
	String name;
	int age;
	Date date;
	
	public User(String name,int age) {
		this.name = name;
		this.age=age;
		this.date = new Date(); // current date
	}
	
	@Override
	public String toString() {
		return String.format("{name : %s,age : %d ,date :%s}" , name , age , date);
	}
	

}
