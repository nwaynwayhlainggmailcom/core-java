package com.jdc.encapsulation;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}
	public Person(String name) {
	    setName(name);
	  }
	  
	  public Person(int age) {
	    setAge(age);
	  }
	  
	  public void setName(String name) {
	    if(name != null || name.isBlank() ||  name.isEmpty())
	      System.out.println("Can't be blank");
	    this.name = name;
	  }
	  
	  public String getName() {
	    return name;
	  }
	  
	  public void setAge(int age) {
	    if(age < 0)
	      System.out.println(" > 0");
	    this.age = age;
	  }
	  
	  public int getAge() {
		  return age;
	  }

}
