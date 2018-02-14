package com.bridgelabz.creationalFactory;

/**Purpose: This program extends Abstract Computer class
 * and override its methods in this subclass Server
 * @author SANa SHAiKH
 * @since 13/01/2018
 */

public class Server extends Computer {

	private String ram;
	private String hdd;
	private String cpu;
	
	public Server(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

}