package com.oop.basic.practice04;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 25, 171, 81);
		Student s2 = new Student("한사람", 23, 183, 72);
		Student s3 = new Student("홍길동", 26, 175, 65);
		
		Student[] sArr = {s1, s2, s3};
		double asum = 0.0, hsum = 0.0, wsum = 0.0;
		double aavg = 0.0, havg = 0.0, wavg = 0.0;
		
		System.out.println("이름\t나이\t신장\t몸무게");
		System.out.println("-----".repeat(6));
		// 배열의 객체 정보 모두 출력
		for (Student st : sArr) {
			System.out.println(st.name +"\t"+ st.age+"\t"+st.height+"\t"+st.weight );
			asum += st.age;
			hsum += st.height;
			wsum += st.weight;
		}
		aavg = Math.round(asum / sArr.length * 100) / 100.0;
		havg = Math.round(hsum / sArr.length * 100) / 100.0;
		wavg = Math.round(wsum / sArr.length * 100) / 100.0;
		// 평균은 소수점 3자리, 2자리표현 Math.round
		// 나이의 평균 출력
		System.out.println("나이의 평균: " + aavg);
		// 신장의 평균 출력
		System.out.println("신장의 평균: " + havg);
		// 몸무게의 평균 출력
		System.out.println("몸무게의 평균: " + wavg);
	}
}
