package com.jdc.abstraction_v2;

public class Cat extends Feline{

	@Override
	void makeSound() {
		System.out.println("meow");
		
	}
	
	@Override
	public void shakeHand() {
		System.out.println("I can shake with hand");
	}
	

}
