package com.jdc.school_mgmt_sys;

public class Main {
	public static void main(String[] args) {
		
		SchoolManagementSystem sys = new SchoolManagementSystem("Java Developer Class");
		
		// Create Students
		Student student1 = new Student("S001", "Aung Myint Myat", "amm@gmail.com", "Grade 10");
		Student student2 = new Student("S002", "Min Khant", "mk@gmailcom", "Grade 10");
		Student student3 = new Student("S003", "Htay Aung", "hta@gmail.com", "Grade 11");
		
		// Create Teachers
		Teacher teacher1 = new Teacher("T001", "Kyaw Kyaw Lwin", "kkl@gmail.com", "Spring");
		Teacher teacher2 = new Teacher("T002", "Min Khant Thu", "mkt@gmail.com", "Database");
		
		// Add people to the system
		System.out.println("Adding people\n******************");
		sys.addPeople(student1);
		sys.addPeople(student2);	
		sys.addPeople(student3);
		
		sys.addPeople(teacher1);
		sys.addPeople(teacher2);
		System.out.println();
		
		// create classrooms
		Classroom c1 = new Classroom("C001", "Grade 10-A");
		Classroom c2 = new Classroom("C002", "Grade 11-B");
		
		
		System.out.println("Adding Classroom\n****************");
		sys.addClassroom(c1);
		sys.addClassroom(c2);
		System.out.println();
		
		// assign teacher to classroom
		System.out.println("Assign teacher to classroom\n****************************");
		sys.assignTeacherToClssroom("T001", "C001");
		sys.assignTeacherToClssroom("T002", "C002");
		System.out.println();
		
		System.out.println("Add student to classroom\n***************************");
		sys.addStudentToClassroom("S001", "C001");
		sys.addStudentToClassroom("S002", "C001");
		sys.addStudentToClassroom("S003", "C002");
		System.out.println();
		
		sys.displayPeople();
		
		System.out.println("\nDisplay Classroom\n**********************");
		sys.displayClassrooms();
		
	}
}
