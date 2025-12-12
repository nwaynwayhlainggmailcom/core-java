package com.jdc.except1;

public class Error {
	
	public static void main(String[] args) {
		recursive();
	}
	
	static void recursive() {
		System.out.println("Hello");
		try {
			recursive();
		} catch (StackOverflowError e) {
			System.out.println("Over....");
		}
		
	}

}
