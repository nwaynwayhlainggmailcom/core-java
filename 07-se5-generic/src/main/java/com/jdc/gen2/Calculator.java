package com.jdc.gen2;

public class Calculator<T extends Number> {
	private T num1;
	private T num2;
	
	Calculator(T num1,T num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double add() {
		return num1.doubleValue() + num2.doubleValue();
	}

}
