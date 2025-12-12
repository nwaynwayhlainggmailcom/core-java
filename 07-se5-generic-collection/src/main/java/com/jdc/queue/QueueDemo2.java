package com.jdc.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo2 {
	public static void main(String[] args) {
		arrayBlockingQueue();
	}
	
	public static void  queueDemo() {
		var list = List.of("JAVA","PHP","MySql","Bootstrap","CSS","JavaScript");
		var link = new LinkedList<String>(list);
		var ad = new ArrayDeque<String>(list);
		
		System.out.println(link);
		System.out.println(ad);
		
		link.offer("Angular");
		ad.element();
		link.poll();
		ad.remove();
	}
	
	public static void arrayBlockingQueue() {
		ArrayBlockingQueue<String> aq = new ArrayBlockingQueue<String>(3, false);
		aq.add("Java");
		aq.add("Angular");
		aq.add("Python");
		
		//System.out.println(aq.add("React"));          //return false
		//aq.add("Spring");       // exception -cuz can put 3
		
		System.out.println(aq);
		
		
		//Delete
		aq.remove();
		aq.poll();
		aq.remove();
		
		System.out.println(aq.poll());    // null
		aq.remove();   // exception -NoSuchElementException
		System.out.println(aq);
		
		//Display
		aq.add("Node JS");
		aq.add("Vue JS");
		System.out.println(aq);
		System.out.println(aq.element());
		aq.remove();
		
		System.out.println(aq.peek());
		aq.remove();
		
		System.out.println(aq.peek());  // null
		System.out.println(aq.remove());     //exception -NoSuchElementException
		
	
	}

}
