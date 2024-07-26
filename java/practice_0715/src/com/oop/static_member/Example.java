package com.oop.static_member;

public class Example {
	public static int staticCount = 0;
	public int instanceCount = 0;
	
	public static void incrementStaticCount() {staticCount++;}
	public void incrementInstanceCount() {instanceCount++;}
	
	public static void main(String[] args) {
		Example example1 = new Example();
		Example example2 = new Example();
	
		Example.incrementStaticCount();
		Example.incrementStaticCount();

		example1.incrementInstanceCount();
		example2.incrementInstanceCount();
		example2.incrementInstanceCount();
		
		System.out.println("Static Count : " + Example.staticCount);
		System.out.println("Example1 : " + example1.instanceCount);
		System.out.println("Example2 : " + example2.instanceCount);
		
	}
	
	
}
