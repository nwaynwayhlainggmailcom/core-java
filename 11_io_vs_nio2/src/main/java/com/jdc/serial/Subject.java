package com.jdc.serial;

import java.io.Serializable;

public class Subject implements Serializable{
	
	String name;
	public Subject(String name) {
		this.name = name;
		
	}
	
	@Override
	public String toString() {
		return String.format("[Subject name = %s]", name);
	}

}
