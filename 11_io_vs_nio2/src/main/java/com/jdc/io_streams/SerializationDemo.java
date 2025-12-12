package com.jdc.io_streams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Scanner;

public class SerializationDemo {
	private static final String FILE = "custom.txt";
	public static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter your operation :");
		var op = sc.next();
		
		if(op.equalsIgnoreCase("O")) {
			write();
		}else if(op.equalsIgnoreCase("I")) {
			read();
		}else {
			System.out.println("Invalid choice !!!");
		}
	}

	

	private static void write() {
		try(var out = new ObjectOutputStream(new FileOutputStream(FILE))) {
			
//			out.writeObject("Hello Java");
//			out.writeObject(new Date());
			
			User u1 = new User("Hla Hla" , 20);
			out.writeObject(u1);
			System.out.println(u1);
			System.out.println("success!!");
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	private static void read() {
		// TODO Auto-generated method stub
		
	}

}
