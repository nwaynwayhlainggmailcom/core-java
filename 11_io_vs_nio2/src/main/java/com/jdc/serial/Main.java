package com.jdc.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	private static final String FILE = "custom.txt";
	public static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
		String ask;
		System.out.println("Enter your operation :");
		var op = sc.next();
		
		if(op.equalsIgnoreCase("O")) {
			serialized();
		}else if(op.equalsIgnoreCase("I")) {
			deSerialized();
		}else {
			System.out.println("Invalid choice !!!");
		}
		System.out.println("Try again:");
		ask = sc.next();
		while(ask.equalsIgnoreCase("Y"));
	}
     // read
	private static void deSerialized() {
		try(var fin = new ObjectInputStream(new FileInputStream(FILE))) {
			Object obj = (User) fin.readObject();
			System.out.println(obj);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something is something");
		}
		
		
	}

	private static void serialized() {
		User user = new User("Thuzar Nwe",20,"Java IO");
				try(var fout = new ObjectOutputStream(new FileOutputStream(FILE))){
					fout.writeObject("Hello Java");
					fout.writeObject(new Date());
					
					System.out.println("Success!!!!");
					
				}catch (Exception e) {
					System.out.println("Error :" +e.getMessage());
						
				}
				
		
	}

}
