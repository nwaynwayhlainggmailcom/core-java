package com.jdc.enum_pkg;

public class AfterEnum {
	public static void main(String[] args) {
		System.out.println(Days.MON);
		
//		int mon = Days.MON;
//		var mon = Days.MON;
//		mon = mon + 10;
		
	}
//	static void showDay() {
//		System.out.println(day);
//	}

}

enum Days{
	MON , TUE , WED , THUR , FRI , SAT , SUN // auto public,static ,final
}
