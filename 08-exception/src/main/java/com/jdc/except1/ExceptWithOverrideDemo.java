package com.jdc.except1;

public class ExceptWithOverrideDemo {
	public static void main(String[] args) {
		
	}
	
	static void test(SuperClass obj) {
		try {
			obj.doSomething();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

// super = if exist exception ,but no exist,(if sum exist, must be lower, no upper than super.
// super = if not exist exception , sub can fix exception (runtime,error) ,cannot use check exception
class SuperClass{
//	void doSomething() throws Exception {
//		System.out.println("Hello from super class.");
//	}
	void doSomething() throws MyException1 {
		System.out.println("Hello from super class.");
	}
}

//IS-A
class SubClass extends SuperClass {
	
//	@Override
//	void doSomething() throws Exception {
//		System.out.println("Hello from sub class");
//	}
	@Override
	void doSomething() throws MyException1 {
		System.out.println("Hello from sub class");
	}
}

class MyException1 extends Exception{}
class MyException2 extends Exception{}
