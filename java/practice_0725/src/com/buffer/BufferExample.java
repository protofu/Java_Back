package com.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferExample {
	public static void main(String[] args) {
		String inputPath = "C:\\Users\\WD\\input.txt";
		String outputPath = "C:\\Users\\WD\\output.txt";

		try {
			// 읽기
			BufferedReader br = new BufferedReader(new FileReader(inputPath));
			// 쓰기
			BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath));

			String line;
			// 파일의 각줄을 읽는다.
			while ((line = br.readLine()) != null) {
				bw.write(line); // 읽은 줄을 출력파일에 작성
				bw.newLine(); // 줄바꿈
			}

			
			bw.flush();
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
