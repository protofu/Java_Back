package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileExample3 {
	public static void main(String[] args) throws IOException{
		// image.jpg 파일 복사, img2 파일 만들기
		String inPath = "C:\\Users\\WD\\Downloads\\who.jpg";
		String outPath = "C:\\Users\\WD\\Downloads\\who2.jpg";
		
		InputStream is = new FileInputStream(inPath);
		OutputStream os = new FileOutputStream(outPath);
		byte[] buffer = new byte[1024];
		int bytesRead;
		while((bytesRead = is.read(buffer))!=-1) {
			os.write(buffer, 0, bytesRead);
		}
		is.close();
		os.close();
	}
}
