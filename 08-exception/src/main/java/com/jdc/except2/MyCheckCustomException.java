package com.jdc.except2;

import java.io.Serial;


public class MyCheckCustomException extends Exception{
	
	public MyCheckCustomException() {
		super();
		
	}
	
	public MyCheckCustomException(String name) {
		super(name);
	}

}
