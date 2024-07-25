package com.read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) {
		try {
			Reader r = new FileReader("C:\\Users\\WD\\output.txt");
//			while(true) {
//				int data = r.read();
//				if(data==-1) break;
//				System.out.println((char) data);
//			}
			
			char[] cArr = new char[16];
			while(true) {
				int num = r.read(cArr);
				if(num == -1) break;
			}
			
			for (char c : cArr) {
				System.out.println(c);
			}
			
			r.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
