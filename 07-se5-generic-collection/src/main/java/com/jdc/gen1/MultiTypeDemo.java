package com.jdc.gen1;

public class MultiTypeDemo {
	public static void main(String[] args) {
		
		/*
		 Item [] it1 = {new Item("", )
		               new Item("", )}
		 */
		
		Pair<String, Integer> p1 = 
				new Pair<>("Apple",1500);
		
		Pair<String, Integer>p2 =
				new Pair<>("Durian",20000);
		
		Pair<String, Double> p3 =
				new Pair<>("MSI",1200.50);
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
		
	}

}
