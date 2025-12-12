package com.jdc.data;

import com.jdc.util.InvalidAgeException;
import com.jdc.util.NameTooShortException;

public class Student {
	private int age;
	private String name;
	
	public Student(String name) {
		setName(name);
	}
	
	public Student(int age)throws InvalidAgeException{
		setAge(age);
	}
	
	public Student(String name,int age)  throws InvalidAgeException{
		
		setName(name);
		setAge(age);
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		if(name.length() <3)
			throw new NameTooShortException("Name length must be greater than 3.");
		this.name = name;
	}
	
	public void setAge(int age) throws InvalidAgeException{
		if(age < 0)
			throw new InvalidAgeException("age must be positive.");
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Student =>" +name+ "||" + age;
	}

}
