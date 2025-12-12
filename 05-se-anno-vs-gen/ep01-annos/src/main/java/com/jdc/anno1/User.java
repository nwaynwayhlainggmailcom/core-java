package com.jdc.anno1;

public class User {
	@NotBlank          //(element = "Name can't be blank")
	@NotNull("Name can't be null") //, count = 0)
	String name;
	
	public User(String name) {
		this.name = name;
	}
	
	@NotNull("no exists")
	void show(){
		
	}

}
