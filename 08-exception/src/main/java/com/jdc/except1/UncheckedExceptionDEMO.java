package com.jdc.except1;

import java.util.Scanner;

public class UncheckedExceptionDEMO {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int [] nums = {10,20,30};
//		System.out.println("Enter Index :");
//		int input = sc.nextInt();
//		showElement(nums , input);
		System.out.println("For a :");
		int a = sc.nextInt();
		
		System.out.println("For b:");
		int b = sc.nextInt();
		
		divideNumber(a,b);
		
		System.out.println("Enter a string :");
		var st = sc.nextLine();
		
		System.out.println("Terminated!");
	}
	
	//ArrayIndexOutOfBoundsException
	public static void showElement(int [] arr,int index) {
		try {
			System.out.println("Element at index " + index+"is" +arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	// ArthmeticException
	public static void divideNumber(int a, int b) {
		try {
			int result = a/b;
			System.out.println("Result ::" + result);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//NumberFormatException
	public static void parseNumber(String st) {
		int num = Integer.parseInt(st);
		System.out.println("Converted Number : " + num);
	}

}
