package com.jdc.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RetainAllDemo {
	public static void main(String[] args) {
		var li = List.of(1,2,3,4,5);
		var list = new ArrayList<>(li);
		var link = new LinkedList<>(li);
		link.add(10);
		link.add(20);
		// var flag = list.contains(3);
		
		// retain = remain | index ပိုများတာကို ရှေ့မှာထားမှ trueထွက်
		System.out.println(list.retainAll(link));  //false
		
		System.out.println(link.retainAll(list)); //true cuz 10,20 will remain
		System.out.println(list.set(2, 3000));
		System.out.println(list.reversed());    //reverse order first <=>last
		System.out.println(list);
		
		var cl = list.clone();
		System.out.println(cl);
		
		var sub = list.subList(1, 3);  // sublist(start , end -1)
		System.out.println(sub);
	}

}
