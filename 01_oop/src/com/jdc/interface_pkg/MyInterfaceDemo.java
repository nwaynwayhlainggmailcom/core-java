package com.jdc.interface_pkg;

public class MyInterfaceDemo {
	public static void main(String[] args) {
		System.out.println();
		
		
		
	}

}

interface MyInterface{
	//instance variable (no)
	//public,static,final
	int i = 10;
	public static final int value = 1000;
	
	//instance method (no)
	//static method
	public static void staticMethod() {}
	
	//as a helper
	default void defaultMethod() {}
	
	private void privateMethod() {
		System.out.println("Private Method");
	}
	
	//abstract method
	void abstractMethod();
}

 
