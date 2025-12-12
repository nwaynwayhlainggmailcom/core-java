package com.jdc.anno4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
public @interface Init {
	String value() default "Default value constructor";

}

class Person {
	
	@Init
	public Person() {
		System.out.println("No Args Constructor.");
	}
	
	@Init("Constructor with String value.")
	public Person(String str) {
		System.out.println("Author Constructor string value :" + str);
	}
}
