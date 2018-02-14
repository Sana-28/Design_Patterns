package com.bridgelabz.structuralAdapter;

/*Create a AdapterPatternDemo class (client class).
This is the client class.  */

public class AdapterPatternBank {
	public static void main(String args[]) {
		CreditCard targetInterface = new BankCustomer();
		targetInterface.giveBankDetails();
		System.out.print(targetInterface.getCreditCard());
	}
}// End of the BankCustomer class.