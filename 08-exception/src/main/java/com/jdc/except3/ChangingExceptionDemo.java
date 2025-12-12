package com.jdc.except3;

public class ChangingExceptionDemo {
	public static void main(String[] args) {
		
	}
	
	public static void processUserInput(String input) throws AppException{
		int number = convertNumber(input);
		int result = calculateSquare(number);
		System.out.println("Result :" + result);
	}
	
	public static int convertNumber(String num) {
		return Integer.parseInt(num);
	}
	
	public static int calculateSquare(int num) {
		return num * num;
	}

}
