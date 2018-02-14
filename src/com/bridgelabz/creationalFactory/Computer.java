package com.bridgelabz.creationalFactory;

/**Purpose: This program is to create a Abstract SUper class
 * and define abstract methods.
 * @author SANa SHAiKH
 * @since 13/01/2018
 */

public abstract class Computer {
	
	//abstract method of class Computer
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString(){
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
	}
}