package com.jdc.io_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CharacterStreamDemo {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		start();
	}
	
	static void start() {
		System.out.println("==========Character Stream Demo=============");
		System.out.println("Choose your operation");
		System.out.println("O : Write data to file");
		System.out.println("I : Read data to file");
		System.out.println("Your choice (O/I)");
		String ans =  sc.nextLine();
		
		if(ans.equalsIgnoreCase("O")) {
			write();
		}else if(ans.equalsIgnoreCase("I")) {
			read();
		}else {
			System.out.println("Invalid choice.");
		}
		
	}
	
	//Writing byte to file
	static void write() {
		System.out.print("Enter the file name to write for byte data : ");
		var filename = sc.nextLine(); // char.txt

		System.out.print("Enter your message to write into the file : ");
		var msg = sc.nextLine(); // Java is amazing.

		try (var writer = new FileWriter(filename, true)) { // true => append mode
			char [] cArray = msg.toCharArray(); // convert to char array
			
			for (char c : cArray) {
				writer.write(c);
			}
			System.out.println("Successfully written to file.");
			
			writer.write(System.lineSeparator()); // add new line after writing msg.

		} catch (FileNotFoundException e) {
			System.err.println("Error : File not found.");
		} catch (Exception e) {
			System.out.println("Error : Something is wrong.");
		}

	}
	
	static void read() {
		System.out.println("Enter the file name to read ::");
		var filename = sc.nextLine();
		
		try(var reader = new FileReader(filename)){   // java is amazing
			int cData =0; //local
			
			System.out.println("\n----File Content-----");
			while((cData = reader.read()) >= 0) {
				System.out.println((char)cData);
			}
		}catch(Exception e){
			System.out.println("File not found exception");
			
		}
	}
	
}
