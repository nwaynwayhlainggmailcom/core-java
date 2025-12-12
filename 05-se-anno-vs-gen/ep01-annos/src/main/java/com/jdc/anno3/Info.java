package com.jdc.anno3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Info {
	int version();
	String author();

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Tasks{
	String[] tag();
	Priority priority();
}

enum Priority{
	LOW,MEDIUM,HIGH
}
