package com.jdc.inheritance;

public class OverridingDemo {
	public static void main(String[] args) {
		var ch = new ChildClass1();
		ch.doSome();
		
	}

}

class ParentClass{
	String value = "Parent value";
	
	void doSome() {
		System.out.println(value);
		System.out.println("Do Something from Parent Class.");
	}
}
class ChildClass1 extends ParentClass{
	//overrriding for not to access any changes from parent's method
	// must be written "@Override" keyword
	// access level(modofier) => 1st public ,2nd protected, 3rd default ,4th private
	//accept => child can greater than parent or level same
	//not accept => child can't smaller than parent
	
	String value = "Child value";
	
	@Override
	void doSome() {
		System.out.println(value);
		System.out.println(super.value); // super keyword use to call parent's value
		System.out.println("Do Something from Parent Class.");
	}
	
}
