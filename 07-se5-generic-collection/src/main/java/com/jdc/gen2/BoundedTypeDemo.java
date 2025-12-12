package com.jdc.gen2;

public class BoundedTypeDemo {
	public static void main(String[] args) {
		DataType<Integer> d1;
		DataType<Short> d2;
		DataType<Number> d3;
	}

}

//upper bound - self vs sub type
class DataType<T extends Number>{
	
}
