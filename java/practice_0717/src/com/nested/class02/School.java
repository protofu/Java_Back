package com.nested.class02;

public class School {
	// 필드 (학교 관련 데이터)
	private String name;
	private Student[] students;
	private int studentCount;

	// 생성자 (학교 객체를 생성할 때 사용)
	public School(String name) {
		this.name = name;
		this.students = new Student[13];
		this.studentCount = 0;
	}
	// students에 학생을 추가하는 메서드 (학교 관련 동작)
	public void addStudent(String studentName, int grade) {
		if (studentCount < students.length) {
			students[studentCount] = new Student(studentName, grade);
			studentCount++;
		} else {
			System.out.println("정원 초과");
		}
	}
	// 전체 학생 정보를 출력하는 메서드 (학교 관련 동작)
	public void printStudent() {
		for (int i = 0; i<students.length;i++) {
			System.out.println(students[i]);
		}
	}
	// 학생 평균 점수를 반환하는 메서드 (학교 관련 동작)
	public double calcAvgGrade() {
		if (studentCount == 0) {
			return 0;
		}
		
		int sum = 0;
		for (int i = 0; i<students.length;i++) {
			sum += students[i].getGrade();
		}
		return (double) sum / studentCount;
	}

	private class Student {
		// 필드 (학생 관련 데이터)
		private String name;
		private int grade;
		
		// 생성자 (학생을 생성할 때 사용)
		public Student(String name, int grade) {
			this.name = name;
			this.grade = grade;
		}

		public String getName() {
			return name;
		}

		public int getGrade() {
			return grade;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", grade=" + grade + "]";
		}

	}
}
