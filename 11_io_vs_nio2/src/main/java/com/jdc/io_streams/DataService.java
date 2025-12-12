package com.jdc.io_streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class DataService {
	
	public final String FILE  = "src/main/resources/INFO/data.txt";
	public static Scanner sc= new Scanner(System.in);
	void write() {
		// Item - name ,price,stock
		System.out.println("How many items do you want to save?");
		int count = Integer.parseInt(sc.nextLine()); // "10" => 10
		
		String [] itemArray = new String[count];
		double[] priceArray = new double[count];
		int[] stockArray = new int[count];
		
		for(int i = 0; i< count ; i++) {
			System.out.printf("Enter name for item %d :" , i+1);
			itemArray[i] = sc.nextLine();
			
			System.out.printf("Enter price for item %s :" , itemArray[i]);
			priceArray[i] = Double.parseDouble(sc.nextLine());
			
			System.out.printf("Enter stock for item %d :", stockArray[i]);
			stockArray[i] = Integer.parseInt(sc.nextLine());
		}
		
		try(var out = new DataOutputStream(new FileOutputStream(FILE))) {
			out.writeInt(count);
			for(int i = 0 ; i < count ; i++) {
				out.writeUTF(itemArray[i]);
				out.writeDouble(priceArray[i]);
				out.writeInt(stockArray[i]);
			}
			System.out.println("Data written successfully");
			
		} catch (Exception e) {
			System.out.println("Error :" +e.getMessage());
		}
	}
	
	void read() {
		try(var in =new  DataInputStream(new FileInputStream(FILE))) {
			int count = in.readInt();
			
			System.out.println("-------Reading data from file ------");
			for(int i = 0 ; i<count ; i++) {
				var name = in.readUTF();
				var price = in.readDouble();
				var stock = in.readInt();
				
				System.out.printf("%s \t : %.2f\t %d\n" , name, price,stock);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
