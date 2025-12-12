package com.jdc.anno3;

public class TestData {
	
	@Info(version = 1 , author = "Jame Gosling")
	public void display() {
		System.out.println("Annotation with primitive,string and class.");
	}
	
	@Tasks(tag  = {"pratical","homework"}, priority = Priority.LOW)
	public void doWork() {
		System.out.println("Doing important task.");
	}

}
