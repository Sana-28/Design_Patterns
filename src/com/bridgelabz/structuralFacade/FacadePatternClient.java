package com.bridgelabz.structuralFacade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**Purpose: This is main class to test Facade Pattern
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
public class FacadePatternClient {
	private static int choice;

	public static void main(String args[]) throws NumberFormatException, IOException {
		do {
			System.out.print("*** Mobile Shop ***\n");
			System.out.print("  1. IPHONE.   \n");
			System.out.print("  2. SAMSUNG.  \n");
			System.out.print("  3. Exit.     \n");
			System.out.print("Enter your choice : ");

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(bufferedReader.readLine());
			ShopKeeper shopKeeper= new ShopKeeper();

			switch (choice) {
			case 1: {
				shopKeeper.iPhoneSale();
			}
				break;
			case 2: {
				shopKeeper.samsungSale();
			}
				break;

			default: {
				System.out.println("Nothing You purchased");
			}
				return;
			}

		} while (choice != 3);
	}
}