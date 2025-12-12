package com.jadc.abstraction;

public class Zoo {
	Animal [] animals = new Animal[10];
	boolean add(Animal animal) {
		for(int i = 0 ; i < animals.length ; i++) {
			if(animals[i] == null) {
				animals[i] = animal;
				return true;
			}
			
		}
		return false;
	}
	
	void wash() {
		for(var a : animals) {
			if(a instanceof Elephant) {
				Elephant e = (Elephant) a;
				e.wash();
				System.out.println();
			}else {
				System.out.println("Why !! I don't like water.");
			}
		}
	}
	
	void feed(String food) {
		for(var a : animals) {
			if(null !=a) {
				a.feed(food);
				System.out.println();
			}
		}
	}

}
