package com.generic06;

public class Course {
	public static void registerCourse1(Applicant<?> applicant) {
		String simpleName = applicant.kind.getClass().getSimpleName();
		System.out.println(simpleName + " : 코스1 등록");
	}
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		String simpleName = applicant.kind.getClass().getSimpleName();
		System.out.println(simpleName + " : 코스2 등록");
	}
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		String simpleName = applicant.kind.getClass().getSimpleName();
		System.out.println(simpleName + " : 코스3 등록");
	}
}
