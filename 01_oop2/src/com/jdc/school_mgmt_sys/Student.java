package com.jdc.school_mgmt_sys;

public class Student extends Person{
	private String gradeLevel;
	
	public Student(String id, String name, String contact, String glevel) {
		super(id, name, contact);
		this.gradeLevel = glevel;
	}
	
	public String getDetails() {
		return String.format("Student :: ID = %s,Name = %s,Contact = %s,Grade Level = %s",id, name , contact , gradeLevel);
	}

	

}
