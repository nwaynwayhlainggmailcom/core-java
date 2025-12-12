package com.jdc.gen3;

public class ConcreteClass<T extends Number> {

}
class ChildClass<T extends Number> extends ConcreteClass<T>{
	
}

class SubType extends ConcreteClass<Integer> {
	
}