package com.jdc.abstract_others;

public class DiamondProblem {
	public static void main(String[] args) {
		var obj = new ConcrteClass();
		obj.display();
		
	}

}
interface A{
	default void display() {
		
	}
}

interface B extends A{
	@Override
	default void display() {
		System.out.println("From Interface B");
	}
}

interface C extends A,B{
	@Override
	default void display() {
		//A.super.display();
		B.super.display();
		System.out.println("From Interface C");
	}
}

class ConcrteClass implements C{
	@Override
	public void display() {
		C.super.display();
	}
}
