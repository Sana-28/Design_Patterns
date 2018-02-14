package com.bridgelabz.structuralAdapter;

/**Purpose: This Socket class is to produce 120volts
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
public class Socket {

	public Volt getVolt(){
		return new Volt(120);
	}
}