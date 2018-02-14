package com.bridgelabz.creationalSingleton;

/**Purpose: This is implementation of Bill Pugh singleton class.
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
public class BillPughSingleton {

	public static void main(String[] args) {
		System.out.println(getInstance());
		System.out.println(getInstance());

		//System.out.println(INSTANCE);
	}

	// constructor
	private BillPughSingleton() {
	}

	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	//public static class
	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}