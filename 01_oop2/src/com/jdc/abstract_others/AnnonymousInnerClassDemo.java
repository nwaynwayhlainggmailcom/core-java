package com.jdc.abstract_others;

public class AnnonymousInnerClassDemo {

	public static void main(String[] args) {
		//create class obj
		
		var mc = new MyClass();
		
		var abs = new AbsClass() {
			@Override
			public void greet() {
				System.out.println("Hello .How are you?");
				
			}
		};
		abs.greet();
	}
}

abstract class AbsClass{
	public abstract void greet();
}

class MyClass extends AbsClass{

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		
	}

}
