package com.jadc.abstraction;

public class AsianElephant extends Elephant{
	
	public AsianElephant(String name) {
		super(name);
	}
	
	
	
	@Override
	void wash() {
		System.out.println("MOO!");
		System.out.println("I love water");
	}
	

}
