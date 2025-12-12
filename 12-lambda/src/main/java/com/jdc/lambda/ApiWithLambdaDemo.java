package com.jdc.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ApiWithLambdaDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Spring","Ruby","Java","Python","Angular");
		
		//Before Lambda
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				return a.compareTo(b);
			}
				
		});
		System.out.println("Comparator :" + list);
		
		Collections.sort(list, (a,b)  -> a.compareTo(b));
		System.out.println("Lambda :" + list);
	}

}
