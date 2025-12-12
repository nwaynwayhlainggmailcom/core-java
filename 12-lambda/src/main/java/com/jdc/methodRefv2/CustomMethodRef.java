package com.jdc.methodRefv2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomMethodRef {
	public static void main(String[] args) {
		
		// static method references
		Printer p1 = CustomMethodRef :: saySomething;
		System.out.println("Hello from static method.");
		
		// instance method references
		Person alice = new Person("Alice", 20);
		Printer p2 = alice :: introduceMessage;
		p2.print("I am Alice.");
		
		// static method with list
		List<Person> people = Arrays.asList(
				new Person("John Wick", 40),
				new Person("God Father", 50),
				new Person("Eithan", 50)
				);
		
		Collections.sort(people, Person::compareByName);
		for (Person p : people) {
			p.introduce();
		}		
	}
	
	static void saySomething(String msg) {
		System.out.println(msg);
	}
}
