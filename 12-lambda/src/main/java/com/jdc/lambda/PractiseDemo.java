package com.jdc.lambda;

public class PractiseDemo {
	
	public static void main(String[] args) {
		Lambda();
	}
	
	static void Lambda() {
		MyInterface1 g = () -> "My interface1";
		System.out.println(g.greet());
		
		
		MyInterface2 g2 = (String n) -> {System.out.println(n);};
		g2.doSome("working");
		
		MyInterface3 g3 = (a,b) -> {return "my interface3 ::" + (a+b);};
		System.out.println(g3.doJob(30, 40));
	}
	
}

@FunctionalInterface
interface MyInterface1 {
	String greet();
}

@FunctionalInterface
interface MyInterface2 {
	void doSome(String name);
}

@FunctionalInterface
interface MyInterface3{
	String doJob(int a ,  int b);
}
