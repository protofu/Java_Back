package com.lambda5;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person p = new Person();
				
		p.action((x, y) -> CalculateService.sum(x, y));
		p.action((x, y) -> CalculateService.multiply(x, y));
		p.action(CalculateService :: sum);
		p.action(CalculateService :: multiply);
	}
}
