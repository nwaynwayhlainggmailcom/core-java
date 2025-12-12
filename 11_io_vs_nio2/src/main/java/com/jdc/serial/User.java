package com.jdc.serial;

import java.io.Serializable;
import java.util.Date;

//not to use abstract method,just like other interface class
// just only use as 'marker interface'
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	String name;
	int age;
	Date date;
	transient Subject subject;
	
	public User(String name, int age , String subject) {
		this.name = name;
		this.age = age;
		this.date = new Date();
		this.subject = new Subject(subject);
	}
	
	@Override
	public String toString() {
		return String.format("User {name = %s, age = %d, date =%s, subject = %s}" , name,age,date,subject);
	}
	
	public boolean hasSubject() {
		return null != subject;
	}

}
