package com.jdc.gen2;

public class TestMain {
	public static void main(String[] args) {
		Test<A> t1 = new Test<>(new A());
		Test<B> t2 = new Test<>(new B());
		Test<B> t3 = new Test<>(new C());
		Test<B> t4 = new Test<>(new D());
	}

}
