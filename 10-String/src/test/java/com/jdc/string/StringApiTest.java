package com.jdc.string;

import org.junit.jupiter.api.Test;

public class StringApiTest {
	
	@Test
	void test_for_other_meh() {
		var s1 = "Hello World";
		System.out.println(s1.trim());
		System.out.println(s1.trim().toUpperCase());
		System.out.println(s1.trim().toLowerCase());
		System.out.println("Java is".concat("OOP lang."));
		
		var info = "Aung Aung , 19, 12/Ahkata(N)12345,097364179,11 ward ,Yangon";
		//String res[] = info.split(",");
		String res[] = info.split(",",5);
		for(String st : res) {
			System.out.println(st.trim());
		}
	}
	
	//@Test
	void test_for_replace() {
		var st = "I like pizza . I make my own pizza";
		var sub = "J-Donut";
		var rep = st.replace("pizza", sub);
		System.out.println(rep);
		
		
		/*
		 \\d = only one digit change
		 \\d{3} = three digit change
		 */
		var info = "123aaa , ** 456 - asdf78 == 500";
		//var reg = info.replaceFirst("\\d", "FFFFF");
		var reg2 = info.replaceAll("\\d", "FFFFF");
		//System.out.println(reg);
		System.out.println(reg2);
	}
	
	//@Test
	void test_for_sub_string() {
		var st ="The crazy dog jumps over the lazy fox";
		System.out.println(st.substring(10));
		//substring(start index , end-1)
		System.out.println(st.substring(10, 23)); 
		
		CharSequence s1 = "Char Sequence";
		String s2 ="String value";
		s1 = s2;
		s2 = (String) s1;
		System.out.println(s1 + "||" +s2);
	}
	
	//@Test
	void test_method_for_compare() {
		var s1 = "hello";
		var s2 = "hello";
		var s3 = "hey";
		
		/*
		 if s1 > s2, +ve value.
		 if s1 < s2 . -ve value.
		 if s1 == s2 ,zero.
		 in case, compare with ascii code
		 */
		
		System.out.println(s1.compareTo(s2));  //0
		System.out.println(s1.compareTo(s3));  //-13
		System.out.println(s3.compareTo(s1)); //13
		
		System.out.println("10".compareTo("5")); // -4
	}
	
	//@Test
	void test_method_for_checking() {
		var s1= "Hello.txt";
		var s2 = "Hello.java";
		System.out.println(s1.startsWith("Hello"));
		System.out.println(s1.endsWith(".java"));
		
		var st =  "Java is amazing";
		System.out.println(st.startsWith("is" , 5));
		System.out.println(st.contains("is"));
		
		System.out.println(s1.equals(s2));
		System.out.println("hello".equalsIgnoreCase("HELLO"));
		
		var a ="";
		var b = " "; // space
		
		System.out.println(a.isBlank() + "||" + a.isEmpty());
		System.out.println(b.isBlank() + "||" + b.isEmpty());
		System.out.println("Java is OOP" .trim());
		
		var g = "Hello,ok?";
		var f = "Hello,No,not ok,";
		var res = a.regionMatches(0, f, 0, 5);
		var res2 = a.regionMatches(true,0, f, 0, 2);
		System.out.println(res);
		System.out.println(res2);
	}
	
	//@Test
	void test_method_for_searching() {
		var st = "Java is amazing";
		System.out.println(st.indexOf('i'));//5
		System.out.println(st.lastIndexOf('i')); //12
		
		System.out.println(st.indexOf("is")); //5
		System.out.println(st.indexOf("ing")); // 12 (ရှေ့က iရဲံ့ index ကိုဘဲယူ)
		
		System.out.println(st.indexOf('i',5)); //5
		System.out.println(st.indexOf("ama" , 0)); // 8
		
	}
	
	//@Test
	void test_about_string() {
		var s1 = "Mg Mg";
		var s2 = new String ("Student");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() + "||" + s2.hashCode());
		
		var res = s1 + "is a Student";
		var res2 = s1.concat("is a Student");
		
		int d1 = Integer.valueOf('a');
		//int d2 = Integer.valueOf("123");
		
		var multi = """
				    How are you?
				    I hope you are well. 
				    As for me, I'm fine.
				    """;
		System.out.println(multi);
		
	}

}
