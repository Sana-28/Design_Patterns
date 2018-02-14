package com.bridgelabz.structuralAdapter;

/**Purpose:This is main class to test Adapter Pattern 
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
public class AdapterPatternTest {

	public static void main(String[] args) {
		
		testClassAdapter();
		testObjectAdapter();
	}

	private static void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,120);
		System.out.println("v3 volts using Object Adapter   : "+v3.getVolts());
		System.out.println("v12 volts using Object Adapter  : "+v12.getVolts());
		System.out.println("v120 volts using Object Adapter : "+v120.getVolts());
	}

	private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,120);
		System.out.println("v3 volts using Class Adapter  : "+v3.getVolts());
		System.out.println("v12 volts using Class Adapter : "+v12.getVolts());
		System.out.println("v120 volts using Class Adapter: "+v120.getVolts());
		System.out.println("\n");

	}
	
	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i){
		case 1: 
			return sockAdapter.get3Volt();
		case 2: 
			return sockAdapter.get12Volt();
		case 3: 
			return sockAdapter.get120Volt();
		default:
			return sockAdapter.get120Volt();
		}
	}
}