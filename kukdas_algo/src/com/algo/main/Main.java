package com.algo.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[][] inputArr = new char[5][15];
		for (int i = 0; i < 5; i++) {
			String inputChar = sc.next();
			for (int j = 0; j < inputChar.length(); j++) {

				inputArr[i][j] = inputChar.charAt(j);
			}
		}


		
		StringBuilder result = new StringBuilder();

		
		loop: 
		for (int j = 0; j < 15; j++) {

			for (int i = 0; i < 5; i++) {

				if (inputArr[0][j] == '\0') {
					break loop;
				}

				if (inputArr[i][j] != '\0') {

					result.append(inputArr[i][j]);

				}
			}
		}
		System.out.println(result.toString());

	}
}
