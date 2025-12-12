package com.jadc.abstraction;

public abstract class Animal {
	
	private String name;
	
	// can write
	//static int i;
	
	public Animal(String name) {
		this.name = name;
	}
	
	// abstract method
	abstract void feed(String food);
	
	
	//can write
//	static void doSome() {}
//	void doJob() {}

}
