package com.bridgelabz.structuralAdapter;

/*Create a BankCustomer class (Adapter class).
This is the adapter class  */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {
	public void giveBankDetails() {
		try {
			BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the account holder name :");
			String customername = bufferedReader.readLine();
			System.out.print("\n");

			System.out.print("Enter the account number:");
			long accno = Long.parseLong(bufferedReader.readLine());
			System.out.print("\n");

			System.out.print("Enter the bank name :");
			String bankname = bufferedReader.readLine();

			setAccHolderName(customername);
			setAccNumber(accno);
			setBankName(bankname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getCreditCard() {
		long accno = getAccNumber();
		String accholdername = getAccHolderName();
		String bname = getBankName();

		return ("The Account number " + accno + " of " + accholdername + " in " + bname
				+ "bank is valid and authenticated for issuing the credit card. ");
	}
}// End of the BankCustomer class.