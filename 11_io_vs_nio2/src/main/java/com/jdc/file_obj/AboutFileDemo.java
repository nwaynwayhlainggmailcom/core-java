package com.jdc.file_obj;

import java.io.File;
import java.io.IOException;

public class AboutFileDemo {
	public static void main(String[] args) throws IOException {
		//relative_path();
		absolute_path();
		System.out.println("File is created.");
	}
	static void absolute_path() throws IOException {
		File file = new File("C:/Users/modern/Documents/Java_note/absolute.txt");
		file.createNewFile();
		
		var parent = "C:/Users/modern/Documents/Java_note/";  // File(String parent, String child)
		File file1 = new File(parent, "file1.txt");    //new File("C:/Users/modern/Documents/Java_note/", "file1.txt")
		file1.createNewFile();
	}
	
	static void relative_path() throws IOException{
		// direction - folder - package
		// build in current folder (root level)
		File file = new File("./test.txt"); // just only object
		file.createNewFile(); 
	}
}
