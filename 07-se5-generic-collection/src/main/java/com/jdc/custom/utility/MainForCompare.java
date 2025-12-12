package com.jdc.custom.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class MainForCompare {
	public static void main(String[] args) {
		var u1 = new User("A");
		var u2 = new User("B");
		var u3 = new User("C");
		
		var set = new HashSet<User>();
		set.add(u1);
		set.add(u2);
		set.add(u3);
		
		System.out.println(set);
		
		System.out.println(Collections.min(set));//A
		System.out.println(Collections.max(set));//C
		
//		var min = Collections.min(set,new UserReverse());
//		System.out.println(min);
		
		System.out.println("==============================================");
		System.out.println("=========For List============");
		var list =new ArrayList<>(set);
		
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		//list → tells Collections.min where to find the elements
		//new UserReverse() → tells it how to compare the elements
		var min = Collections.min(list); //A
		var min1 = Collections.min(list,new UserReverse()); //C cuz reverse
		System.out.println("Min::" +min +"Min1 :" +min1);
		System.out.println(Collections.max(list,new UserReverse()));
	}

}
