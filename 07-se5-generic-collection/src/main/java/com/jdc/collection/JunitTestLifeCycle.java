package com.jdc.collection;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitTestLifeCycle {
	
	@BeforeAll
	static void setUp() {
		System.out.println("Before alll");
	}
	
	@BeforeEach
	void init() {
		System.out.println("Before each");
	}
	
	@Test
	void test() {
		System.out.println("This is test method");
	}
	
	@Test
	void test1() {
		System.out.println("This is test1 method");
	}


}
