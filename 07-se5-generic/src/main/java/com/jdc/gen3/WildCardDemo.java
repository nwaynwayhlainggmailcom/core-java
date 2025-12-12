package com.jdc.gen3;

public class WildCardDemo {
	public static void main(String[] args) {
		WildCardBox<Integer> w1 = new WildCardBox<>(1000);
		printUpper( w1);
		
		WildCardBox<String> w2 = new WildCardBox<>("Hello");
		printLower( w2);
		
		
	}
	
	//extends =self and its sub type
	static void printUpper(WildCardBox<? extends Number> box) {
		System.out.println(box.getValue());
		
		
	}
	
	// extends - self and its parent type up type
	static void printLower(WildCardBox<? super String> box) {
		System.out.println(box.getValue());
	}

}

class WildCardBox<T>{
	T value;
	
	public WildCardBox(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
		
	}
	
}
