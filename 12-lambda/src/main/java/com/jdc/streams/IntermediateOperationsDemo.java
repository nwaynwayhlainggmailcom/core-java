package com.jdc.streams;

import java.util.List;

public class IntermediateOperationsDemo {
	
	public static void main(String[] args) {
		
		var it = new OperationsData();
		//it.filteringElement();
		//it.distinctVsSorted();
		forTakeWhileVsDropWhile();
		
	}
	
	static void forTakeWhileVsDropWhile() {
		var nums  = List.of(1,2,3,6,2,1);
		
		//1 2 3 (take while = check by order,take each point and if condition false it will not check continue)
		// out put = 1 2 3 cuz condition is false at 6(6 is not less than 5).So it will not continue
		System.out.println("Take While\n***********");
		nums.stream()
		.distinct()
		.takeWhile(n -> n <5)
		.forEach(n -> System.out.println(n));
		
		
		//out put = 6 4 cuz dropWhile take false value con.. false at 6(6 is not less than 5)
		// it output  all value from the condition false start
		// when condition false it start outputs
		// if n>5 => 1 2 3 6 4 (cuz con.. false at 1 and it will start out put from 1 and all of  behind 1)
		System.out.println("\n Drop while\n******************");
		nums.stream()
		.distinct()
		.dropWhile(n -> n <5)
		.forEach(n -> System.out.println(n));
		
		
	}

}
