package com.client;

import java.io.IOException;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 8080);
			System.out.println("[클라이언트] 연결 성공");
			
			s.close();
			System.out.println("[클라이언트] 연결 종료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
