package com.jdc.collection;

import java.util.ArrayList;
import java.util.List;

public class WithoutIterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Spring");
		list.add("Hibernate");
		list.add("JDBC");
		
		System.out.println(list);
		
		for(var val : list) {
			if(val.startsWith("S")) {
				list.remove(val);
			}
		}
		System.out.println(list);
	}

}
