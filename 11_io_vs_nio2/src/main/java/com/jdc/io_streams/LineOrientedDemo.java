package com.jdc.io_streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class LineOrientedDemo {
	public static Scanner sc=  new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("What do you want to do ?");
		System.out.println("Type 'O' : Write with BufferWriter");
		System.out.println("Type 'OO' : Write with PrintWriter");
		System.out.println("Type 'I' : Read file content");
		var ans = sc.nextLine();
		
		if(ans.equalsIgnoreCase("O")) {
			writeV1();
		}else if(ans.equalsIgnoreCase("OO")) {
			writeV2();
		}else if(ans.equalsIgnoreCase("I")) {
			read();
		}else {
			System.out.println("Invalid choice! Please choose 'O','OO' or 'I'");
		}
	}
	
	// write file with bufferedWriter
	private static void writeV1() {
		System.out.println("Enter filename to write :");
		var filename = sc.nextLine();
		
		try(var bw = new BufferedWriter(new FileWriter(filename))) {
			String line ,  ans;
			
			do {
				System.out.println("Enter a line to writer into the file");
				line = sc.nextLine();
				bw.write(line); // How are you?
				bw.newLine();
				System.out.println("Do you want to add another line :");
				ans = sc.nextLine();
			} while (ans.equalsIgnoreCase("Y"));
			System.out.println("Successfully written to file.");
					
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	private static void writeV2() {
		System.out.println("Enter filename to write :");
		var filename = sc.nextLine();
		
		try(var pw = new PrintWriter(filename)) {
			String line = ""; 
			System.out.println("Start typing your content.Type 'E' or 'F' to finish or exist"); 
			while ((line = sc.nextLine()) != null) {
				if(line.equalsIgnoreCase("Exist") || line.equalsIgnoreCase("Finish")) {
					break;
				}
				pw.println(line);
				
			}
			
		} catch (Exception e) {
			System.out.println("Erroe : " + e.getMessage());
		}
		
	}
	private static void read() {
		System.out.println("Enter file name to read");
		var filename = sc.nextLine();
		
		String line;
		System.out.println("\nReading file content ...");
		
		try(var br = new BufferedReader(new FileReader(filename))) {
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("\n ---End of file-------");
		} catch (Exception e) {
			System.out.println("Error :" + e.getMessage());
		}
	}
	

}
