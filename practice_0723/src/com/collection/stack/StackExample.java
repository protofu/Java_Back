package com.collection.stack;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(5));
		coinBox.push(new Coin(1));
		
		while(!coinBox.isEmpty()) {
			Coin c = coinBox.pop();
			System.out.println("꺼낸 동전 : " + c.getValue());
		}
	}
}
