package com.jdc.anno3;

public class VarargsDemo {
	public static void main(String[] args) {
		beforeVarargs("Hello");
		System.out.println();
		
		varArray("AA","BB","CC");
		
		String[] arr = {"AA","BB","CC"};
		normalArray (arr);
		
	}
	
	static void beforeVarargs(String name) {
		System.out.println("Name :" + name);
	}
	
	// varArgs parameter always must be last parameter
	// in argument ;ist, var-args != other variable value(not same type)
	static void varArray(String value , String ... name) {
		System.out.println("I ::" + value);
		for(var n : name) {
			System.out.println(name + " ");
		}
	}
	
	static void normalArray(String[] arr) {
		for(var n : arr) {
			System.out.println(n + " ");
		}
	}

}
