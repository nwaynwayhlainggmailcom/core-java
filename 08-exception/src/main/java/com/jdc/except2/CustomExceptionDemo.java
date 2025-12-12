package com.jdc.except2;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		// method invocation
		try {
			processData(-5);
		} catch (MyCheckCustomException e) {
			System.out.println("Mistake ::" + e.getMessage());
		}
		inputData("ab");
	}
	
	static void inputData(String st) {
		if(st.length() < 3)
			throw new MyUncheckedCustomException("Input must be >3");
		System.out.println("Input:" + st);
	}
	
	static void processData(int value) throws MyCheckCustomException {
		if(value < 0)
			throw new MyCheckCustomException("Value must be positive"); 
		
		System.out.println("Value : " + value);
	}

}
