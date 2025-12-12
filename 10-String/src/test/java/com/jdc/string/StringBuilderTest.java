package com.jdc.string;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class StringBuilderTest {
	
	@Test
	void test_methods_for_sb() {
		var sb = new StringBuilder();
		
		int[] arr = {1,2,3,4,6};
		char [] ch = {'a','e','i','o','u'};
		
		sb.append("Hello");
		sb.append(false);
//		sb.append('$');
//		sb.append(arr);
		sb.append(ch, 1, 3);
		System.out.println(sb);
		
		var res = sb.append("99999");
		System.out.println(res);
		System.out.println(sb); //Hellofalseeio99999
		
		sb.delete(4, 7); // Helllseeio99999 (start, end - 1)
		System.out.println(sb);
		
		sb.deleteCharAt(4);
		System.out.println(sb); // Hellseeio99999
		
		// allow
//		sb.insert(1, new Date());
//		System.out.println(sb);
		
		sb.insert(4, 12.0f);
		System.out.println(sb); // Hell12.0seeio99999
		
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder parallel = sb.reverse().append(true).insert(1, "77777");
		String st = parallel.toString(); // mutable to immutable.
		
		System.out.println(parallel);
		System.out.println(st.toUpperCase());
		
	}
	
	//@Test
	void test_for_ensure_capacity() {
		var sb = new StringBuilder(10); // l = 0, c = 10
		showDetails(sb); // l = 0 , c = 10
		
		sb.ensureCapacity(20); 
		showDetails(sb); // l = 0 , c = [eC > pre] = (pre * 2) + 2 == 22
		
		sb.ensureCapacity(20); 
		showDetails(sb); // l = 0, c = 22
		
		sb.ensureCapacity(25); 
		showDetails(sb); // l = 0, c = 46
	}
	
	//@Test
	void test_methods_for_string_builder() {
		var sb1 = new StringBuilder();
		var sb2 = new StringBuilder(20);
		
		sb1.setLength(10);
		showDetails(sb1);
		
		sb2.ensureCapacity(22);
//		showDetails(sb2); // 20, reassign - 10(minimum) === 42
		sb2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ");
		showDetails(sb2);
		
		
	}
	
	//@Test
	void test_about_string_builder_constructor() {
		
		StringBuilder sb1 = new StringBuilder();            // l = 0, c = 16(default)
		StringBuilder sb2 = new StringBuilder(10);   		// l = 0, c = 10(specific)
		StringBuilder sb3 = new StringBuilder("ABCDEFGHI"); // l = 9, c = l + default = 25
		
		showDetails(sb1);
		showDetails(sb2);
		showDetails(sb3);
		
		System.out.println("After update\n****************");
		sb1.append("ABCDEFGHIJKLMNOPQRST");
		showDetails(sb1); // l = 20 , c = 16, c =  [l > c] ==> (c * 2) + 2 = 34
		
		sb2.append("ABCDEFGHIJKLMNO");
		showDetails(sb2); // l = 15, c = 10, c = [l > c] ==> (c * 2) + 2 = 22
		
		sb3.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		showDetails(sb3); // l = 35, c = 25 , c = [l > c] ==> (c * 2) + 2 = 52
		
		sb3.append("hello");
		showDetails(sb3); // l = 40, c = [l < c] = 52 (previous capacity)
		
		sb2.append("hello");
		showDetails(sb2); // l = 20, c = 22 (previous capacity)
		
		
		
	}
	
	void showDetails(StringBuilder sb) {
		System.out.println("Lenght :  " + sb.length() + " || " + "Capacity : " + sb.capacity());
	}
}
