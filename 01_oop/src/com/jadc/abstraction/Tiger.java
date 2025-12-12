package com.jadc.abstraction;

public class Tiger extends Animal{
	public Tiger(String name) {
		super(name);
		
	}
	
	@Override
	void feed(String food) {
		if(food.equals("meat")){
			System.out.println("Wow ! so yummy");
			System.out.println("I like" + food);
		}else {
			System.out.println("So bitch !! I hate this "+ food);
		}
	}

}
