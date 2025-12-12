package com.jdc.except1;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckExceptionDemo {
	public static void main(String[] args) {
		FileReader file;
		try {
			file = new FileReader("test.txt");
			readFile(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Terminated.");
		
	}
	
	static void readFile(FileReader fr) {
		System.out.println("File exists.");
	}

}
