package com.jdc.gen3;

public class A {
	void showA() {
		System.out.println("This is classA.");
	}

}

class B extends A{
	void showB () {
		System.out.println("This is class.B");
	}
}

class C extends B {
	void showC() {
		System.out.println("This is class.C");
	}
}

class D extends B {
	void showC() {
		System.out.println("This is class.D");
	}
}
