package com.jdc.abstraction_v2;

public class MainAnimal {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		makeSound(a1);
		
		a1 = new Cat();
		makeSound(a1);
		
		a1 = new Tiger();
		makeSound(a1);
		
		var dog = new Dog();
		shakeHand(dog);
		
		var cat = new Cat();
		shakeHand((Pet) cat);
		
		var rob = new RoboDog();
		shakeHand(rob);
	}
	
	static void shakeHand(Pet d) {
		d.shakeHand();
	}

	
	static void makeSound(Animal a) {
		a.makeSound();
	}
}
