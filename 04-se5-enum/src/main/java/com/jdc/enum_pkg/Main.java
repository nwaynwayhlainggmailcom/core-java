package com.jdc.enum_pkg;

import com.jdc.enum_pkg.Employee.Position;

public class Main {
	public static void main(String[] args) {
		var emp = new Employee("Htay Lwin" , 500000);
		emp.setGender(Gender.MALE);
		emp.setPosition(Position.HR);
		emp.empInfo();
		
	}

}
