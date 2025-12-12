package com.jdc.lambda;

public class LambdaDemo {
	
	public static void main(String[] args) {
		beforeLambda();
		afterLambda();
	}
	static void beforeLambda() {
		Greeting g =  new Greeting() {
			public void sayHello(String name) {
				System.out.println(name);
			}
		};
		g.sayHello("Greeting");
		Calculate cal = new Calculate() {
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};
		System.out.println(cal.add(10, 20));
	}
	
	static void afterLambda() { 
		Greeting g = (String s) -> {System.out.println(s);};
		g.sayHello("after lambda");
	    
		Greeting g1 = s ->  System.out.println(s);
		g1.sayHello("Omission");
		
		Calculate cal = (int x , int y) -> {return x+y;};
		System.out.println(cal.add(10, 20));
		
		Calculate cal1 = (x,y) -> x+y;
		System.out.println(cal.add(20, 20));
		
	}

}

//SAM = single abstract method
@FunctionalInterface
interface Greeting{
	//default,private , static , final variable
	void sayHello(String name);
}

@FunctionalInterface
interface Calculate{
	int add(int a , int b);
}


