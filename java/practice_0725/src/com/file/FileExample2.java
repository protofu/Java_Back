package com.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample2 {
	public static void main(String[] args) throws IOException{
		String fileName = "profile.txt";
		String dirPathStr = "C:\\Users\\WD\\upload";
		String filePathStr = "C:\\Users\\WD\\upload\\" + fileName;
		
		Path dirPath = Paths.get(dirPathStr);
		Path filePath = Paths.get(filePathStr);
		
		if (!Files.exists(dirPath)) {
			Files.createDirectories(dirPath);
			System.out.println("디렉토리 없어서 생성");
		} else {
			System.out.println("이미 있는걸 디래ㅔㄱ토리");
		}
		
		if(!Files.exists(filePath)) {
			Files.createFile(filePath);
			System.out.println("새로운 파일 생성 완료");
			BufferedWriter bw = new BufferedWriter(new FileWriter(filePathStr));
			bw.write("사 쥔");
			bw.flush();
			bw.close();
		} else {
			System.out.println("파일이 이미 있음");
		}
	}
}
