package com.jdc.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamData {
	
	void fromCollection() {
		System.out.println("From Collection\n***********");
		List<String> list = List.of("Java","Spring","React");
		
		Stream<String> stream = list.stream();
		stream.forEach(System.out::println);
		
		var parallel = list.parallelStream();
		parallel.forEachOrdered(System.out::println);
	}
	
	void fromArray() {
		System.out.println("From Array\n************");
		int [] array = {1,2,3,4,5,6};
		
		var sum = Arrays.stream(array).sum();
		System.out.println(sum);
	}

}
