package com.bridgelabz.structuralProxy;

/**Purpose: This class implements the Internet interface,
 * and override its define method.
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
public class RealInternet implements Internet {

	@Override
	public void connectTo(String serverHost) {
		// TODO Auto-generated method stub
		System.out.println("Connecting to " + serverHost);
	}
}
