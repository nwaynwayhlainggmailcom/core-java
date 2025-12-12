package com.jdc.methodRefv2;

public class ExtendPerson extends Person {
	
	public ExtendPerson(String name , int age) {
		super(name,age);
	}
	
	void introduceMessage(String msg) {
		System.out.println(msg);
	}

}
