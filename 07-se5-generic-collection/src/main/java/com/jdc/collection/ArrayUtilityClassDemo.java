package com.jdc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtilityClassDemo {
	public static void main(String[] args) {
		int [] intArr = {1,2,3,4,5};  //array
		//utilityDemo(intArr);
	    //Sort
		Arrays.sort(intArr);
		System.out.println("After Sort ::" + Arrays.toString(intArr));
		
		// binary search
		//need to sort before search
		// 1 2 3 4 5 => search from middle =3. left<3, right>3;
		// 1 2 3 4 5 6 => mid = (3+4)/2
		int index = Arrays.binarySearch(intArr, 3); //2
		System.out.println("Index of 3 ::" + index);
		
		//copy
		int [] copy = Arrays.copyOf(intArr, intArr.length + 1);
		System.out.println("Copy Array :: " +Arrays.toString(copy));
		
		int [] copyRange = Arrays.copyOfRange(copy, 1, 4);
		System.out.println("Copy Range of Array ::" + Arrays.toString(copyRange));
		
		// fill
		Arrays.fill(copy, 7);
		System.out.println("Copy Array ::" +Arrays.toString(copy));
		
		//equals
		int [] i1 = {1,2,3};
		int [] i2 = {1,2,3};
		int [] i3 = {1,3,2};
		
		var bool = Arrays.equals(i1, i2) ? "True" : "False";
		System.out.println("Equals ::" +bool);
		
	    bool = Arrays.equals(i1, i3) ? "True" : "False";
		System.out.println("Equals ::" +bool);
		
		
	}

	private static void utilityDemo(int[] intArr) {
		List list = Arrays.asList(intArr); //array to List (immutable)=> immu cuz Arrays ကိုဘဲ import လုပ်သွားလို့
		
		var mu = new ArrayList<>(list);    // immu to mutable
		mu.add(10);
		System.out.println(mu);
		
		var cli = List.copyOf(mu);       //  mutable to immutable
		cli.add(10);
	}

}
