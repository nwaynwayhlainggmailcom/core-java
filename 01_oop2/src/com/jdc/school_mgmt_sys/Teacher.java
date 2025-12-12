package com.jdc.school_mgmt_sys;

public class Teacher extends Person {
	private String subject;
	
	public Teacher(String id, String name, String contact, String subject) {
		super(id, name, contact);
		this.subject = subject;
	}

	@Override
	public String getDetails() {
		return String.format("Studnet ::: ID = %s, Name = %s, Contact = %s, Subject = %s",
				id, name, contact, subject);
	}
	
	
}
