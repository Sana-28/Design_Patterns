package com.bridgelabz.creationalFactory;

/**Purpose: Super classes and sub-classes ready,
 * This program is to test write our factory class.
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type))
		{
			return new PC(ram, hdd, cpu);
		}
			
		else if ("Server".equalsIgnoreCase(type))
			return new Server(ram, hdd, cpu);
		
		else if ("Laptop".equalsIgnoreCase(type))
		return new Laptop(ram, hdd, cpu);

		return null;
	}
}