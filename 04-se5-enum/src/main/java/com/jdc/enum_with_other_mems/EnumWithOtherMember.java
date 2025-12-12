package com.jdc.enum_with_other_mems;

import java.util.Scanner;

public class EnumWithOtherMember {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Execute enum with method");
		System.out.println("**************************");
		
		takeOperation(Operator.PLUS);
		System.out.println();
		
		takeOperation(Operator.MIN );
		System.out.println();
		
		takeOperation(Operator.MUL);
		System.out.println();
		
		takeOperation(Operator.DIV );
		System.out.println();
	}
	
	static void takeOperation(Operator op) {
		System.out.println("Enter num1:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2:");
		int num2 = sc.nextInt();
		
		Operator opea = op;
		var result =  opea.takeOperation(num1, num2);
		System.out.println(op.getFullname() + " Result = " + result);
		
	}

}


enum Operator{
	PLUS("Plus"){
		@Override
		int takeOperation(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
	},
	MIN("Minus"){

		@Override
		int takeOperation(int a, int b) {
			// TODO Auto-generated method stub
			return a-b;
		}
		
	},
	MUL("Multiplication"){

		@Override
		int takeOperation(int a, int b) {
			// TODO Auto-generated method stub
			return a*b;
		}
		
	},
	DIV("Division"){
		@Override
		int takeOperation(int a , int b) {
			if(b < 0) {
				System.out.println("Error");
			}else {
				return a/b;
			}
			return 0;
		
			
		}
		
	};

	
	//instance variable
	String fullname;
	
	//constructor
	Operator(String fullname) {
		this.fullname = fullname;
	}
	
	//instance method
	//abstract int takeOperation(int a, int b);


	public String getFullname() {
		return fullname;
	}
	abstract int takeOperation(int a,int b);
}
	
	