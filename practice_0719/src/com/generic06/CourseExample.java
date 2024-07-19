package com.generic06;

public class CourseExample {
	public static void main(String[] args) {
		Applicant<Person> p = new Applicant<>(new Person());
		Applicant<Worker> w = new Applicant<>(new Worker());
		Applicant<Student> s = new Applicant<>(new Student());
		Applicant<HighStudent> hs = new Applicant<>(new HighStudent());
		Applicant<MiddleStudent> ms = new Applicant<>(new MiddleStudent());
		
		Course.registerCourse1(p);
		Course.registerCourse1(w);
		Course.registerCourse1(s);
		Course.registerCourse1(hs);
		Course.registerCourse1(ms);
		System.out.println();

//		Course.registerCourse2(p);
//		Course.registerCourse2(w);
		Course.registerCourse2(s);
		Course.registerCourse2(hs);
		Course.registerCourse2(ms);
		System.out.println();
		Course.registerCourse3(p);
		Course.registerCourse3(w);
//		Course.registerCourse3(s);
//		Course.registerCourse3(hs);
//		Course.registerCourse3(ms);
		
	}
}
