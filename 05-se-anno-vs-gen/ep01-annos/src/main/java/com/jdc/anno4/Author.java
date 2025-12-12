package com.jdc.anno4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Author {
	String name();
	int age();

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Book {
	String title();
	Author author(); // using annotation  as a type 
}
