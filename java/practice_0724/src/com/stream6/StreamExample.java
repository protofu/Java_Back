package com.stream6;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) throws IOException {
		String absolutePath = "C:\\Users\\WD\\Desktop\\Java_study\\workspace\\data.txt";
		Path path = Paths.get(absolutePath);
		
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
//		stream.forEach(System.out :: println);
		stream.forEach(l -> {
			String[] productInfo = l.split(" ");
			int pno = Integer.parseInt(productInfo[0]);
			String pName = productInfo[1];
			String pCom = productInfo[2];
			int price = Integer.parseInt(productInfo[3].replace("_", ""));
			Product p = new Product(pno, pName, pCom, price);
			System.out.println(p);
		});
		stream.close();
	}
}
