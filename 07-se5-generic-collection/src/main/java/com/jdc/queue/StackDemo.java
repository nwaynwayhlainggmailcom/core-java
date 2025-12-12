package com.jdc.queue;


import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		var list = List.of("AA","DD","CC");
		Deque<String> d = new ArrayDeque<>(list);
		Queue<String> q = Collections.asLifoQueue(null);
		
		q.add("DD");
		q.offer("KK");
		System.out.println(q);
		
		q.remove();
		q.poll();
		System.out.println(q);
		System.out.println(q.element());
		
		Stack<String> s = new Stack<>();
		s.push("OO");
		s.push("PP");
		s.push("QQ");
		System.out.println(s);
		
		s.pop();
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
				
				
		
	}

}
