package com.jdc.methodRefv2;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void introduce() {
		System.out.println("Hi , I'm "+ name + ", age " + age);
	}
	
	void introduceMessage(String msg) {
		System.out.println(msg);
	}
	
	static int compareByName(Person p1 , Person p2) {
		return p1.name.compareTo(p2.name);
	}

}
