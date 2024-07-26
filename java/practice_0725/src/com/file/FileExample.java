package com.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) throws IOException {
		String dataPath = "C:\\Users\\WD\\data.txt";
		File file = new File(dataPath);
		
		if(file.createNewFile()) {
			System.out.println("생성");
		} else {
			System.out.println("존재");
		}
		
		System.out.println("파일 경로 : " + file.getAbsolutePath());
		System.out.println("쓰기 가능 여부 : " + file.canWrite());
		System.out.println("읽기 가능 여부 : " + file.canRead());
		System.out.println("파일 크기 : " + file.length() + " 바이트");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(dataPath));
		bw.write("야");
		bw.newLine();
		bw.write("야");
		bw.newLine();
		bw.write("야");
		bw.newLine();
		bw.write("야");
		bw.newLine();
		bw.write("야");
		bw.newLine();
		bw.write("야");
		bw.newLine();
		bw.write("야");
		bw.newLine();
		bw.flush();
		bw.close();
		System.out.println("파일 크기 : " + file.length() + " 바이트");
	}
}
