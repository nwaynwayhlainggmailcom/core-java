package com.jdc.school_mgmt_sys;

public class Polymorphism {
	public static void main(String[] args) {
		//same reference but different obj and process
		Animal a1 = new Dog();
		a1.eat();
		
		a1 = new Cat();
		a1.eat();
		
	}

}

class Animal{
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal{
	void eat() {
		System.out.println("Dog is eating");
	}
}
class Cat extends Animal{
	void eat() {
		System.out.println("Cat is eating");
	}
}
