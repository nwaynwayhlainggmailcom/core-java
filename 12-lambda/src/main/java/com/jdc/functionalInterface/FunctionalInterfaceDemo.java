package com.jdc.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		forSupplier();
		forPredicate();
		forFunction();
		
	}
	
	static void forFunction() {
		// R apply(T t)
		// String name ="baby" ,name.length() => 4
	
		Function<String, Integer> f1 = String::length;
		System.out.println(f1.apply("baby")); //4
		
		Function<String, Integer> f2 = s -> s.length();
		System.out.println(f2.apply("baby"));
		
		Function<Integer , Integer> plusOne = a -> a+1;
		Function<Integer , Integer> twoTimes = a -> a*1;
		
		Function<String ,  Integer> converter = s -> Integer.parseInt(s);
		
		// (x+1)*2
		Function<Integer , Integer> pipe = plusOne.andThen(twoTimes);
		System.out.println(pipe.apply(3));  // (3+1)*2 =8
		
		Function<Integer, Integer> composed = plusOne.compose(twoTimes);
		System.out.println(composed.apply(3)); //3s
		
		
	}
	
	static void forPredicate() {
		Predicate<String> empty = String::isEmpty;
		Predicate<String> blank = String::isBlank;
		System.out.println(empty.test(""));
		System.out.println(empty.test(" "));
		System.out.println(blank.test(""));
		System.out.println(blank.test(" "));
		
		var list = List.of(1,2,3,4,5,6,7,8,9,10);
		HashSet<Integer> set = new HashSet<>(list);
		var pre = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t % 2 == 0;
			}
			
		};
		
		set.removeIf(pre);
		System.out.println(set); // [1,3,5,7,9]
		
		Predicate<Integer> pr =  data -> data%2 != 0;
		set.removeIf(pr);
		System.out.println(set);//[]
		
		//Predicate<String> contain = (String s) -> s.contains("a");
		//Predicate<String> empty = String::isEmpty;
		//System.out.println(empty.test(""));
		Predicate<String> contain = s -> s.contains("a");
		Predicate<String> combine = contain.and(empty.negate()); // contains 'a' AND not empty
		System.out.println(combine.test("apple"));   // true
		
		
		
		
	}
	
	static void forConsumer() {
		Consumer<String> printer = s -> System.out.println(s);
		printer.accept("Hello Consumer");
		
		Consumer<String> printer2 = System.out::println;
		printer2.accept("Hello from method red.");
		
		//changing value
		Consumer<String> c1 = s -> System.out.println(">>" + s);
		Consumer<String> c2 = s -> System.out.println("<<");
		Consumer<String> chain = c1.andThen(c2);
		
		System.out.println();
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println(nums);
		
		
		
	}
	
	static void forSupplier() {
		Supplier<Double> random = Math::random;
		System.out.println(random.get());
		
		Supplier<ArrayList<String>> list = ArrayList::new; // constructor references
		ArrayList<String> li = list.get();
		System.out.println(li);
		
		
	}

}
