package com.jdc.inheritance_version2;

public class Car {
	
	//Has-a relationship
	Engine engine; // Dependency Injection, directly access
	
	
	//CONSTRUCTOR ,SETTER (DI)
	Car(Engine engine){
		this.engine = engine;
		
	}
	
	void drive() {
		engine.start();
		System.out.println("Can drive");
	}

}
