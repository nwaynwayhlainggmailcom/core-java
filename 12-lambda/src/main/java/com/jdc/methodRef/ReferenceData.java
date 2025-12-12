package com.jdc.methodRef;

public class ReferenceData {
	
	public   ReferenceData() {
		System.out.println("No argumetns constructor");
	}
	
	public ReferenceData(String message) {
		System.out.println("One Argumetn Constructor ::" + message);
	}
	
	static void showStaticMessage(String msg) {
		System.out.println("Static Method :" +msg);
	}
	
	void showInstanceMessage(String msg) {
		System.out.println("Instance method :" +msg);
	}

}
