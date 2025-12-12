package com.jdc.gen2;

public class Test<T extends A> {
	private T obj;
	
	public Test(T obj) {
		this.obj = obj;
	}
	
	public void display() {
		obj.showA();
	}

}
