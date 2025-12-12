package com.jdc.anno4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorDemo {
  
  public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    Class<Person> clazz = Person.class;
    
    for(Constructor<?> constructor : clazz.getDeclaredConstructors()) {
      
      if(constructor.isAnnotationPresent(Init.class)) {
        
        var anno = constructor.getAnnotation(Init.class);
        
        System.out.println("Constructor ::" + constructor);  
        System.out.println("Annotation value ::" +  anno.value());
        
        if(constructor.getParameterCount() == 0) {
          constructor.newInstance();  // call no-args const
        }
      } else {
        
        constructor.newInstance("param constructor");  //call arguments Constructor
        
        
      }
      
    }
  }

}