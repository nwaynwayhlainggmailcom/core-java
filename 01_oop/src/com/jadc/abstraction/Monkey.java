package com.jadc.abstraction;

public  class Monkey extends Animal{

	public Monkey(String name) {
		super(name);
		
	}
	
	@Override
	void feed(String food) {
		System.out.println("Kwi Kwi :: I like" + food);
	}
	
	void dance() {
		System.out.println("I can dance :: kwi kwi");
	}

}
