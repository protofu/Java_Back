package com.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:\\Users\\WD\\output.txt");
			
//			byte a = 65;
//			byte b = 66;
//			byte c = 67;
//			
//			os.write(a);
//			os.write(b);
//			os.write(c);
			
//			byte[] arr = { 68, 69, 70, 71, 72, 73 };
//			os.write(arr);
			
			byte[] arr = { 65, 66, 67, 76, 79, 86, 69 };
			os.write(arr, 4, 3);
			
			
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
