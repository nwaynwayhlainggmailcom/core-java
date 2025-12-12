package com.jdc.anno2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BehaviorChangeWithAnnotation {
	
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		UserService service = new UserService();
		
		int userAge = 25;
		
		Method[] methods = UserService.class.getDeclaredMethods();
		
		for(var method : methods) {
			//System.out.println(method.getName());
			//watch movie,drink alcohol,playgame
			//check, have annotation in methods?
			if(method.isAnnotationPresent(MinAge.class)) {
				//get this annotation(@MinAge)
				var anno = method.getAnnotation(MinAge.class);
				if(userAge >= anno.value()) {           
					method.invoke(service, userAge);        //allmethod
				}else {
					System.err.println("Not enough age");
				}
			}else {
				//not have annotation method
				method.invoke(service, userAge);
			}
		}
	}

}
