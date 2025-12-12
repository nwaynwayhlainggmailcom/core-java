package com.jdc.except1;

import java.io.IOError;
import java.util.Scanner;

public class TryCatchOrMultiCatchDemo {
	public static void main(String[] args) {
		manyCatch();
		multiCatch();
	}
	
	// write many catch as you like(check,unchecked,error,super exception)
	// but lowest -> must be super exception
	static void manyCatch() {
		try {
			String st = "Hello";
			System.out.println(st.length());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("NullPointerException");
		}catch(IOError e) {
			System.out.println("IOError");
		}catch (Exception e) {
			// TODO: handle exception
		}catch(Throwable e) {
			
		}
		
		
		
	}
	
	
	//in multiCatch , catch block only one, can write(check,unchecked,error)
	//if exist(super exception),can't write sub exception	
    static void multiCatch() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ::");
		var s = sc.next();
		
		try {
			int num = Integer.parseInt(s);
			System.out.println("Number :" +num);
		} catch (ArithmeticException | NullPointerException  e) {
			System.out.println(e.getMessage());
		}catch (IOError e) {
			System.out.println("IOError");
		}finally {
			// shutdown
			//if not ok with catch block,finally block must do.
			System.out.println("Finally block");
		}
		
		
	}

}
