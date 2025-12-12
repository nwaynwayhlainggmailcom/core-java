package com.jdc.gen1;

public class GenericTest {
	public static void main(String[] args) {
		// java 5
		Data<String> d1 = new Data<String>();
		
		//java => 7
		Data<Integer> d2 =new Data<>();
		
		//java 10+
		var d3 = new Data<Float>();
		
		//var <Integer> list = new ArrayList<Integer>();
	}

}

// generic class - single type
class Data<T> {
	
}
