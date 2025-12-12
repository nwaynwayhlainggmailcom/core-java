package com.jdc.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TerminalOperationDemo {
	
	static List lang = List.of("Angular", "Python" , "React" ,"PHP");
	static List<String> lan = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		//forIteration(lang);
		forChecking(lang);
		forRetrieving(lan);
	}
	
	static void forRetrieving(List<String> list) {
		long count = list.stream().count();
		System.out.println("Total Count :" +count);
		
		Optional<String> first = list.stream().findFirst();
		System.out.println("First :" +first.orElse("No found"));
		
		Optional<String> any = list.stream().findAny();
		System.out.println("First :" +any.orElseThrow());
	}
	
	static void forChecking(List<String> list) {
		
		// True if at least one matches.
		boolean hashJava = list.stream()
				.anyMatch(lang -> lang.contains("Java"));
		System.out.println(hashJava);
		
		
		// True if all value is match with condition
		boolean hashAll = list.stream()
				.allMatch(lang -> lang.startsWith("P"));
		System.out.println(hashAll);
		
		
		// True if no value matches with condition
		boolean noOne = list.stream()
				.noneMatch(lang -> lang.startsWith("C"));
		System.out.println(noOne);
	}
	
	static void forIteration(List<String> list) {
		list.stream()
		.forEach(lan -> System.out.println("Language :" + lan));
		
		System.out.println();
		
		list.parallelStream()
		.forEach(lan -> System.out.println("Language :" + lan));
		
		System.out.println();
		
		
	}

}
