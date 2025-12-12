package com.jdc.inheritance_version2;

public class CompositionDemo {

	public static void main(String[] args) {
		var car =  new Car(new Engine());
		car.drive();
		
	}

}
