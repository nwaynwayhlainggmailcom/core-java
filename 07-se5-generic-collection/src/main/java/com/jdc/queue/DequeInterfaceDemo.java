package com.jdc.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterfaceDemo {
	
	public static void main(String[] args) {

		Deque<String> ad =  new ArrayDeque<>();
		
		ad.add("Java");
		ad.add("Angular");
		ad.add("Python");
		System.out.println(ad);
		
		ad.addFirst("PHP");
		ad.addLast("React");
		System.out.println(ad);
		
		ad.removeFirst();
		ad.pollLast();
		System.out.println(ad);
		
		ad.removeFirst();
		ad.pollLast();
		System.out.println(ad);
		
		ad.remove();
		
		ad.remove(); //error
		ad.poll();  //null
		
	}

}
