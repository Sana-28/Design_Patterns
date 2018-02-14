package com.bridgelabz.creationalFactory;

/**Purpose:This is main method to execute Computer Factory
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
public class TestFactory {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		Computer laptop=ComputerFactory.getComputer("laptop", "32GB","4 TB", "3.2 GHz");
		
		System.out.println("Factory PC Configuration     : "+pc);
		System.out.println("Factory Server Configuration : "+server);
		System.out.println("Factory Laptop Configuration : "+laptop);
	}

}