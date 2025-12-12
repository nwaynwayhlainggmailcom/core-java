package com.jdc.collection;

import java.util.HashSet;

import com.jdc.custom.utility.Data;

public class MainSimple {
	public static void main(String[] args) {
		
		Data d1 = new Data("Hello");
		Data d2 = new Data("Hello");
		System.out.println(d1.value);
		System.out.println(d2.value);
		
		System.out.println(d1.hashCode());
		System.out.println(d1.hashCode());
		
		System.out.println(d1.value == d2.value);  // true cuz value are same
		System.out.println(d1.equals(d2));        // false cuz obj are not same
		
		// set cannot access duplicate but d1=hello, d2=hello is etered cuz their hashcode is different
		//so ,to know computer that their hashcode are equal by using hashcode and equal 
		//so, it put hello only one 
		var set = new HashSet<Data>();
		set.add(d1);
		set.add(d2);
		System.out.println(set);
	}

}
