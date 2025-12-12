package com.jdc.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListInterfaceTest {
	
	static List li = List.of("Java", "Spring", "React(Js)", "JPA", "Servlet", "Tailwind"); // 100% - 70%
	
	static List<String> list;
	static List<String> link;
	
	@BeforeAll
	static void setUp() {
		list = new ArrayList<>(); // null
		link = new LinkedList<String>(li);
	}
	
	@Test
	void test() {
		
		list.addAll(li); // same
		
		list.add("Pyton");
		list.addFirst("Angular");
		list.addLast("Ruby");
		
//		assertTrue(list.contains("Spring"));
//		
//		assertTrue(list.containsAll(link));
//		assertTrue(link.containsAll(list));
		
//		System.out.println(list.get(4)); // 
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		System.out.println(list.isEmpty());
//		System.out.println(list.size()); // 9
		
//		assertEquals(8, list.size() - 1);
//		assertEquals(9, list.size());
		
		System.out.println("Before Remove :: " + list);
		
		System.out.println(list.remove(4));
		System.out.println("After remove :: " + list);
		
		System.out.println(list.remove("Spring"));
		System.out.println("After remove :: " + list);
		

	}
	
	@AfterAll
	static void shutDown() {
		//System.out.println("ArrayList :: " + list);
		//System.out.println("LinkedList :: " + link);
	}
	
	
	
	
	
}

