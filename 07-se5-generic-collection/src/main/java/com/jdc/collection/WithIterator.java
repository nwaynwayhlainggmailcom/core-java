package com.jdc.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WithIterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Spring");
		list.add("Hibernate");
		list.add("JDBC");
		
		System.out.println(list);
		
		//get first iterator abj
		Iterator<String> it= list.iterator(); // Java,spring 
		
		while(it.hasNext()) {
			//get first element
			String element = it.next();  //java
			if(element.startsWith("S")) {
				it.remove();
			}
			
		}
		System.out.println(list);
	}

}
