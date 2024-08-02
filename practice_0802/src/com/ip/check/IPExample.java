package com.ip.check;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPExample {
	public static void main(String[] args) {
		// IP 주소를 확일할 때는 java.net 패키지의 InetAddress를 확인한다.
		
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local);
			String myIP = local.getHostAddress();
			System.out.println(myIP);
			
			InetAddress[] remoteArr = InetAddress.getAllByName("google.com");
			for (InetAddress remote : remoteArr) {
				String naverIP = remote.getHostAddress();
				System.out.println(naverIP);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
