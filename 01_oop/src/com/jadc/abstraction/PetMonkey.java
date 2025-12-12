package com.jadc.abstraction;

public class PetMonkey extends Monkey{
	public PetMonkey(String name) {
		super(name);
	}
	
	@Override
	void feed(String food) {
		System.out.println("I am pet monkey");
		System.out.println("kwi kwi :: I like "+ food);
	}

}
