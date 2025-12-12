package com.jdc.gen2;

public class GenericMethodDemo {
	public static void main(String[] args) {
		printData("Hello");
		printData(10000);
		printData(12.000f);
		
		String[] sAr = {"Luffy","Zoro","Sanji","Nami"};
		Double [] iAr = {9.9,9.5,9.7,9.4};
		
		printDataV2(sAr);
		printDataV2(iAr);
		
	}
	
	public static <T> T getFirst(T[] data) {
		return data[0];
	}
	
	// assign value in method.
	public static <T> void printData(T data) {
		System.out.println("Data :" + data);
	}
	
	public static <T> void printDataV2(T[] data) {
		for(T type : data) {
			System.out.println("Data :" + type);
		}
		
	}

}
