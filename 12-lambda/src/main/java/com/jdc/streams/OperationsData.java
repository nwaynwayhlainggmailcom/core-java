package com.jdc.streams;

import java.util.List;
import java.util.stream.Collectors;

public class OperationsData {
	
	void distinctVsSorted() {
		System.out.println("Distinct Vs Sorted\n********");
		var nums = List.of(4,2,7,2,5,4);
		
		System.out.println("---------Skip vs Limit---------");
		nums.stream().distinct().limit(3).forEach(System.out::println);
		System.out.println("\n");
		// 1 1 2 2 4 4 7 5 =>skip2 ဆို နှစ်နေရာ skip (1 1 skip => output = 224475 )
		nums.stream().sorted().skip(2).forEach(System.out::println);
		
		System.out.println("-----------Distinct------------");
		nums.stream().distinct().forEach(n -> System.out.print(n +" "));
		System.out.println("\n");
		
		System.out.println("----------Sorted----------");
		nums.stream().sorted().forEach(n -> System.out.print(n +" "));
		
		nums.stream().distinct().sorted().forEach(n -> System.out.println());
		
	}
	
	//peek = display out put one by one in order
	void usingStreamElements() {
		System.out.println("Peek Element\n******");
		 List<Integer> numbers = List.of(1,2,3,4,5);
		 
		 List<Integer> s1 = numbers.stream()
				 .peek(n -> System.out.println("After map :" +n))
				 .filter(n -> n % 2 ==0)
				 .peek(n -> System.out.println("Filter map :" +n))
				 .map(n -> n*2)
				 .peek(n -> System.out.println("Time map : " + n))
				 .collect(Collectors.toList());
		
		
	}
	
	void filteringElement() {
		System.out.println("Filtering Element\n******");
		var names = List.of("Aung","Kyaw","Su","Chaw","Nwe","Sai");
		//names.stream().filter(name -> name.length() > 3).map(name -> name.toUpperCase());
		names.stream()
		.filter(name -> name.length() > 3)
		//.map(name -> name.toUpperCase());
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		var numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		numbers.stream()
		.filter(num -> num%2 == 0)
		.map(num -> String.valueOf(num))
		.forEach(System.out::println);
		
		
	}

}
