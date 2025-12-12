package com.jdc.io_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ByteStreamDemo {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		start();
	}
	
	static void start() {
		System.out.println("==========Byte Stream Demo=============");
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
		System.out.println("Enter file name to write for byte data :");
		var filename = sc.nextLine();
		
		System.out.println("Enter your message to write into the file");
		var msg = sc.nextLine();
		
		//true => append mode
		try (var fout = new FileOutputStream(filename,true) ){
			
			//{1b,2b,3b}
			byte[] bArray = msg.getBytes(); // convert string to byte array
			
			for(byte b : bArray) {
				fout.write(b); // write each byte
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Erroe :" +e.getMessage());
		} catch (Exception e) {
			System.out.println("Erroe : Something was wrong" );
		}
	}
	
	static void read() {
		System.out.println("Enter the file name to read ::");
		var filename = sc.nextLine();
		try(var fin = new FileInputStream(filename)){
			int bData =0; //local
			
			System.out.println("\n----File Content-----");
			while((bData = fin.read()) >= 0) {
				System.out.println((char)bData);
			}
		}catch(Exception e){
			System.out.println("File not found exception");
			
		}
	}
	

}
