package com.jdc.collection;


import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class SetInterfaceTest {
	
	static HashSet<Integer> hset;
	static TreeSet<Integer> tset;
	static LinkedHashSet<Integer> Lhset;

	// before all method, do
	@BeforeAll
	static void setUp() {
		hset = new HashSet<>();
		tset = new TreeSet<>();
		Lhset = new LinkedHashSet<>();
	}

	// Before @Test method, do once
	@BeforeEach
	void init() {
		for (int i = 20; i > 0; i--) {
			hset.add(i);
			tset.add(i);
			Lhset.add(i);
		}
	}

	@Test
	@DisplayName("Test For HashSet")
	@Order(1)
	void test_for_hset() {
		hset.add(20);
		//hset.add(null);
		hset.add(1500);
		//assertTrue(hset.isEmpty());
		assertFalse(hset.isEmpty());       // check condition
		hset.remove(1500);
		System.out.println(hset);
	}

	// after all method, do
	@AfterAll
	static void shutDown() {
		System.out.println("HashSet ::: " + hset);
		System.out.println("TreeSet :::" + tset);
		System.out.println("LinkHashSet ::" +Lhset);
	}
	
	

}
