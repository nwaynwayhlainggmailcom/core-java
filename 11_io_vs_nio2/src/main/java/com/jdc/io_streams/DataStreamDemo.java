package com.jdc.io_streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class DataStreamDemo {
	public static Scanner sc=  new Scanner(System.in);
	
	public static void main(String[] args) {
		
		var ds = new DataService();
		System.out.println("What do you want to do ?");
		System.out.println("Your anser(O for write , I for read and U for update)");
		var ans = sc.nextLine();
		
		
		if(ans.equalsIgnoreCase("O")) {
			ds.write();
		}else if(ans.equalsIgnoreCase("I")) {
			ds.read();
		}else {
			System.out.println("Invalid choice! ");
		}
	}
	
}
