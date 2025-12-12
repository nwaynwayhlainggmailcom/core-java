package com.jdc.abstract_others;

public class OuterClass {
	
	static int staticVariable = 10;
	int outerInstanceVariable = 20;
	
	//static nested class
	static class StaticNestedClass{
		static void display() {
			System.out.println("Static Nested Class");
			System.out.println("Outer Static Variable :: " +staticVariable);
		}
	}
	
	//non-static inner class
	class NonStaticInnerClass{
		void display() {
			System.out.println("Non static Inner Class.");
			System.out.println("Outer Non-static Variable ::" + outerInstanceVariable);
			System.out.println("Outer Static Variable :: " + staticVariable);
		}
		
	}
	
	//local class
	void mylocal() {
		class LocalInnerClass {
			void display() {
				System.out.println("Hello from local Inner Class");
			}
		}
		LocalInnerClass local = new LocalInnerClass();
		local.display();
	}

}
