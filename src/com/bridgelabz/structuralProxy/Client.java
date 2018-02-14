package com.bridgelabz.structuralProxy;

/**Purpose: This is Client Class to test for Proxy Design pattern
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
public class Client {
	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		try {
			internet.connectTo("google.co.in");
			internet.connectTo("abc.com");
			internet.connectTo("gmail.com");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}