package com.jdc.streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamData {
	
	void fromBuilder() {
		System.out.println("From Builder\n********");
		var stream = Stream.builder().add("Kotlin")
				.add("Flutter")
				.add("Go")
				.add("Scala")  // builder obj ကပိုင် cannot use sorted
				.build()      // Stream obj ကပိုင်  can use sorted
		        .sorted();
		
		var list = stream.toList();
		System.out.println(list);
		//list.forEach(System.out::println);
	}
	
	void fromFactory() {
		System.out.println("Using Factory\n****************");
		var stream = Stream.of("Vue","Angular","Node Js","React","Next Js");
		var str = stream.sorted();
		
		str.forEach(System.out::println);
	}
	
	void fromGenerate() {
		System.out.println("Using Generate");
		var stream = Stream.generate(Math::random).limit(3);
		stream.forEach(System.out::println);
	}
	
	void fromIterate() {
		System.out.println("\nUsing Iterate\n");
		                      // 0 = seed , n-> n+3 =function
		var stream = Stream.iterate(0, n -> n + 3).limit(5);
		
//		for(int i = 0 ; i<5 ; i+=3) {
//			System.out.println(i);
//		}
		
		stream.forEach(System.out::println);
	}
	
	void fromRange() {
		System.out.println("\nFrom Range\n********");
		IntStream.range(1, 5).forEach(value -> System.out.println(value + " "));
		
		System.out.println("\n");
		IntStream.rangeClosed(1, 5).forEach(value -> System.out.println(value + " "));
		
	}
	
	void fromTextFile() {
		System.out.println("\nText File\n**********");
		
		try(var stream = Files.lines(Path.of("poem.txt"))) {
			stream.forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void fromCollection() {
		System.out.println("From Collection\n*************");
		List<String> list = List.of("Java", "Spring","React");
		
		Stream<String> stream = list.stream();
		list.forEach(System.out::println);
		System.out.println();

		
		var parallel = list.parallelStream();
		parallel.forEachOrdered(System.out::println);
	}
	
	void fromArray() {
		System.out.println("\nFrom Array\n*********");
		int [] array = {1,2,3,4,5,6};
		
		var sum = Arrays.stream(array).sum();
		System.out.println(sum);
	}
}
