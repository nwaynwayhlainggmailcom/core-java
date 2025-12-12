package com.jdc.abstract_others;

public class NestedClassDemo {
	public static void main(String[] args) {
		var out = new OuterClass();
		System.out.println(OuterClass.staticVariable);
		System.out.println(new OuterClass().outerInstanceVariable);
		
		//for static class
		OuterClass.StaticNestedClass.display();
		
		//for non-static class
		OuterClass.NonStaticInnerClass inner = new OuterClass().new NonStaticInnerClass();
		inner.display();
		System.out.println();
		
		//fpr local class
		OuterClass outer = new OuterClass();
		outer.mylocal();
		
		
	}

}
