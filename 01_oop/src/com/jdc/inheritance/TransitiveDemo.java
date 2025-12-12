package com.jdc.inheritance;

public class TransitiveDemo {
	public static void main(String[] args) {
		var c1 = new Child();
		c1.name = "Nway";
		c1.age = 20;
		c1.display();  // instance variable are owned by obj ,so when call it use obj.
		
		var ggf = new GreatGrandFather();
		ggf.display();
		//ggf.doSome();;
		
		
		
	}

}

class GreatGrandFather {
	String name;
	int age;
	
	void display() {
		System.out.println(name);
		System.out.println(age);
	}
}
class GrandFather extends GreatGrandFather{
	void doSome() {
		System.out.println("I am god father");
	}
}
class Father extends GrandFather{
	void doShow() {
		System.out.println("I am a master");
	}
}
class Child extends Father{
	
}
