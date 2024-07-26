package com.oop.practice04;

public class StudentExample {
	public static void main(String[] args) {
		Student student1 = new Student("Alice", 20);
		Student student2 = new Student("Bob", 22);
	
		student1.printStudentInfo();
		student2.printStudentInfo();
		
		System.out.println("총 학생 수: " + Student.getStudentCount());
		
		student1.setName("Alicia");
		System.out.println("변경된 이름: " + student1.getName());
	
		student1.printStudentInfo();
		student2.printStudentInfo();
	}
}
