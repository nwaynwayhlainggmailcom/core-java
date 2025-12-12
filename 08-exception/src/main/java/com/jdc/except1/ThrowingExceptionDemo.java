package com.jdc.except1;

import java.io.File;
import java.io.IOException;

public class ThrowingExceptionDemo {
	static int count;
	static String st = null;
	public static void main(String[] args) {
		//usage layer
		try {
			docheck();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		douncheck();
	}
	
	static void docheck() throws IOException,Exception {
		File file = new File("test.txt");
		if(count < 0)
			//throw new IOException();  // check exception
			throw new IOException("File not found Exception"); 
		
	}
	
	static void douncheck() {
		if(st.length() == 100)
			//throw new NullPointerException();
			throw new NullPointerException("String is null.");
	}

}
