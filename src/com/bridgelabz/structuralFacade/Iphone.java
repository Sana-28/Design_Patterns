package com.bridgelabz.structuralFacade;

// Iphone implementation class that will implement Mobile shop interface.
/**Purpose: This class implements method of MobileShop
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
public class Iphone implements MobileShop {

	@Override
	public void modelNo() {
		// TODO Auto-generated method stub
		 System.out.println(" Iphone 6 ");  
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
	    System.out.println(" Rs 65000.00 ");  
	}  

}
