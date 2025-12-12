package com.jdc.anno1;

import java.lang.reflect.Field;

public class CompileVsRuntimeDemo {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		User1 u = new User1("Aung");
		
//		Method[] method = User1.class.getDeclaredMethods();
//		for(Method method : methods) {
//			System.out.println(method.getName());
//		}
		
		Field[] fields = User1.class.getDeclaredFields();
		for(Field field :  fields) {
			 //check name field jas @NotNull
			if(field.isAnnotationPresent(NotEmpty.class)) { 
				field.setAccessible(true);
				String value = (String) field.get(u);
				
				if(value == null || value.isEmpty()) {
					System.out.println(field.getName() + "Name :: exists");
				}
			}else {
				System.out.println("Name exists");
			}
		}
	}

}
