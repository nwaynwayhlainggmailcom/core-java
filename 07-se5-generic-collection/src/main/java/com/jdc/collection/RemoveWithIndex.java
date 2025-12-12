package com.jdc.collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveWithIndex {
	public static void main(String[] args) {
		
		var li = List.of(1,2,3,4,5);
		
		var list = new ArrayList<>(li); // Integer
		list.add(1500);
		list.add(9999);
		list.add(10000);
		
		System.out.println(list);
		list.remove(5); // 1500
		System.out.println(list);
		
		list.remove(Integer.valueOf(9999));
		System.out.println(list);
		
	}
}
