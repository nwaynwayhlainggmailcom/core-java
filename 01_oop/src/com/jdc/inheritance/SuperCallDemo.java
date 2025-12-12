package com.jdc.inheritance;

public class SuperCallDemo {
	public static void main(String[] args) {
		var mar = new Marcedes(4,"black");
		
		mar.info();
	}

}

class Car {
	int wheels;
	String colors;
	
	// constructor overload;
	Car(){
		super(); //parent constructor default
	}
	
    Car(int wheels,String colors) {
    	this.wheels = wheels;
    	this.colors = colors;
		System.out.println("This is Parent Constructor");
	}
	
	void info() {
		System.out.println("Car has " + wheels + "wheels.");
		System.out.println("Color is : " + colors);
	}
	
	
}
class Marcedes extends Car{
	
	int wheels;
	String colors;
	
	public Marcedes(int wheels , String colors) {
		super(wheels , colors);
		System.out.println("");
	}
	
}

