package com.jdc.except2;

public class MyUncheckedCustomException extends RuntimeException{
	
	public MyUncheckedCustomException() {
		super();
		
	}
	
	public MyUncheckedCustomException(String msg) {
		super(msg);
	}

}
