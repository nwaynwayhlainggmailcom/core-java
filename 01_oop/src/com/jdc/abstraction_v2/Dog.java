package com.jdc.abstraction_v2;

public class Dog extends Cannine implements Pet{

	@Override
	void makeSound() {
		System.out.println("woof woof.");
	}
	
	@Override
	public void shakeHand() {
		System.out.println("I can shake with hand");
	}

}
