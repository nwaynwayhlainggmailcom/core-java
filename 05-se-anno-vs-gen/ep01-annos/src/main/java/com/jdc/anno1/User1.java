package com.jdc.anno1;

public class User1 {
	
	@NotEmpty
	private String name;
	
	public User1(String name) {
		this.name = name;
	}
	
	void display() {}

}
