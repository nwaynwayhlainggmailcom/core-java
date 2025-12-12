package com.jdc.enum_pkg;

public class Employee {
	String name;
	int salary;
	Gender gender;
	Position position;
	
	public Employee(String name , int salary) {
		this.name = name;
		this.salary = salary;
		setGender(gender);
		setPosition(position);
	}
	
	public void empInfo() {
		System.out.println("Name :: %s || Salary :: %d".formatted(name,salary));
		System.out.println("Gender :: " + gender);
		System.out.println("Position :: " + position);
	}
	
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	enum Position{
		Manager, HR ,staff
	}
	

}

enum Gender{
	MALE , FEMALE , OTHERS
}
