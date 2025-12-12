package com.jdc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionUtilityClass {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Spring");
		list.add("Hibernate");
		list.add("Angular");
		list.add("ColBol");
		list.add("Flutter");
		list.add("Python");
		
		System.out.println("Before :: " + list);
		
		//sort
		Collections.sort(list);
		System.out.println("After ::" + list);
		
		// reverse
		Collections.reverse(list);
		System.out.println("Reverse List ::" +list);
		
		// shuffle  => change order in every run time (every round order not same)
		Collections.shuffle(list);
		System.out.println("Shuffle List :: " +list);
		
		//min vs maxs
		String min = Collections.min(list);
		String max = Collections.max(list);
		System.out.println("Max :: %s || Min :: %s ".formatted(max,min));
		
		//Frequency
		var count = Collections.frequency(list, "java");
		System.out.println("Frequency count ::" + count);
		
		List<String> unmodiList = Collections.unmodifiableList(list);
		unmodiList.add("Ruby");
		System.out.println("Unmodified List ::" +unmodiList);
		
	}
	

}
