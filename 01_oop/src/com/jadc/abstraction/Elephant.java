package com.jadc.abstraction;

public abstract class Elephant extends Animal{
	public Elephant(String name) {
		super(name);
	}
	
	void feed(String food) {
		System.out.println("I am eating " + food);
		System.out.println("MOO MOO");
	}
	
	abstract void wash();
		
	

}
