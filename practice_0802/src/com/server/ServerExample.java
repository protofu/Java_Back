package com.server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample {
	private static ServerSocket serverSocker = null;
	public static void main(String[] args) {
		System.out.println("서버를 종료하려면 :wq!를 입력하세요.");
		
		startServer();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			if (sc.nextLine().equals(":wq!")) {
				break;
			}
		}
		sc.close();
		
		stopServer();
	}

	private static void startServer() {
		Thread thread = new Thread() {

			@Override
			public void run() {
				try {
					serverSocker = new ServerSocket(8080);
					System.out.println("[서버] 서버 시작");
					
					while(true) {
						System.out.println("[서버] 요청 기다리는 중...");
						Socket s = serverSocker.accept();
						
						InetSocketAddress isa = (InetSocketAddress) s.getRemoteSocketAddress();
						String clientIP = isa.getHostString();
						System.out.println("[서버] " + clientIP + "의 연결 요청 수락");
								
						s.close();
						System.out.println("[서버] " + clientIP + "의 연결 종료");
					}
				
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		};
		thread.start();
		
	}

	private static void stopServer() {
		try {
			serverSocker.close();
			System.out.println("[서버] 종료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
