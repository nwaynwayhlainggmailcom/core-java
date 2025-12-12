package com.jdc.except1;

public class CallStackDemo {
	
	public static void main(String[] args) {
		System.out.println("Start mainmethod ");
		method1();
		System.out.println("End mainmethod ");
	}
	
	static void method1() {
		System.out.println("Start method 1.");
		method2();
		System.out.println("End method 1.");
	}
	
	static void method2() {
		System.out.println("Start method 2.");
		method3();
		System.out.println("End method 2.");
	}
	
	static void method3() {
		System.out.println("Start method 3.");
		method4();
		System.out.println("End method 3.");
	}
	
	static void method4() {
		System.out.println("Start method 4.");
		method5();
		System.out.println("End method 4.");
	}
	
	static void method5() {
		System.out.println("Start method 5.");
		int i = 10;
		int f = 0;
		try {
			int result = i/f; 
			System.out.println("Result :: " +result);
		} catch (ArithmeticException e) {      // try ka exception nk catch ထဲထည့်ထားတဲ့ exception different yin  သူလိုချင်တဲ့ ဖမ်းထားတာမဖြစ်လို့ method5 ko call tr tk method 4=>3/2/1 အဆင့်ဆင့်သွားရှာ 
			//e.printStackTrace();
			System.err.println(e.getMessage());
			
		}
		//int result = i/f;  // Arithmetic exception
		
		System.out.println("End method 5.");
	}



}
