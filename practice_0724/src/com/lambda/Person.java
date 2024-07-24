package com.lambda;

public class Person {
	public void ordering(Comparable comparable) {
		String value1 = "Dog";
		String value2 = "Cat";
		
		int result = comparable.compare(value1, value2);

		if (result < 0) {
			System.out.println(value1 +" > "+ value2);
		} else if(result > 0) {
			System.out.println(value1 +" < "+ value2);
		} else {
			System.out.println(value1 +" = "+ value2);
		}
	}
}
