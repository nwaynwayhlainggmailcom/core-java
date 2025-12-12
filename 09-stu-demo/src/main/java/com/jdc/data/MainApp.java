package com.jdc.data;

import com.jdc.util.InvalidAgeException;
import com.jdc.util.NameTooShortException;

public class MainApp {
	public static void main(String[] args) {
		
		try {
			var s1 = new Student("Luffy",25);
			System.out.println(s1);
			
			var s2 = new Student("Zoro",30);
			System.out.println(s2);
		} catch (InvalidAgeException e) {
			System.out.println("Mistake  ::" + e.getMessage());
		}
		try {
			var s3 = new Student("Tom");
			System.out.println(s3);
		} catch (NameTooShortException e) {
			System.out.println("Mistake  ::" + e.getMessage());
		}
		
		try {
			var s4 = new Student("40");
			s4.setAge(-20);
		} catch (InvalidAgeException e) {
			System.out.println("Mistake  ::" + e.getMessage());
		}
		
		
	}
	
	

}
