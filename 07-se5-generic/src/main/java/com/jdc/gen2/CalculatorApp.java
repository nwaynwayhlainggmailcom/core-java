package com.jdc.gen2;

public class CalculatorApp {
	public static void main(String[] args) {
		Calculator<Integer> intCal =
				new Calculator<>(10,20);
		System.out.println("Integer Sum::" + intCal.add());
		
		Calculator<Double> doubleCal = new Calculator<>(5.5,6.6);
		System.out.println("Double Sum :: " + doubleCal.add());
	}

}
