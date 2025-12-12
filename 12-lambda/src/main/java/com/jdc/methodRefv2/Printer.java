package com.jdc.methodRefv2;

@FunctionalInterface
public interface Printer {
	void print (String msg);

}

@FunctionalInterface
interface PersonCreator{
	Person create(String name, int age);
}
