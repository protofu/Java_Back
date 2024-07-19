package com.string;

import java.io.IOException;
import java.util.Arrays;

public class BytesToStringExample {
	public static void main(String[] args) throws IOException {
		String data = "제현이";
		byte[] arr1 = data.getBytes();
		System.out.println(Arrays.toString(arr1));
		String str1 = new String(arr1);
		System.out.println(str1);
		
		byte[] arr2 = data.getBytes("EUC-KR");
		System.out.println(Arrays.toString(arr2));
		String str2 = new String(arr2, "EUC-KR");
		System.out.println(str2);
	}
}
