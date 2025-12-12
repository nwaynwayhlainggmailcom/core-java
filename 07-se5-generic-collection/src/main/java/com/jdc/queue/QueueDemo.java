package com.jdc.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemo {
	public static List<String> list = List.of("Java","Spring","Python","React");
	public static void main(String[] args) {
		LinkedListTest(list);  // use list
	}
	
	static void LinkedListTest(List<String>list) {     //In main, you can call LinkedListTest(...) with any kind of List.
		Queue<String> link = new LinkedList<>(list);
		
		link.add("Java");
		link.offer("Ruby");
		
		link.remove(); // remove first entered obj //if empty array is remove exception appear
		link.poll();     //if empty array use it null is output //if you want to go to the end should use poll() as remove cuz it don't show exception like remove
		
		link.element();   //call element that has in array if empty cannot show element exception appear
		link.peek();         // like link.element(); but output null
		System.out.println("Link => " +link);
	}

}
