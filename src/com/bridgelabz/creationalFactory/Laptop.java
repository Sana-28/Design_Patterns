package com.bridgelabz.creationalFactory;

/**Purpose: This program extends Abstract Computer class
 * and override its methods in this subclass Laptop.
 *  * @author SANa SHAiKH
 * @since 13/01/2018
 */
public class Laptop extends Computer {
	private String ram;
	private String hdd;
	private String cpu;
	
	public Laptop(String ram, String hdd, String cpu)
	{
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

}
