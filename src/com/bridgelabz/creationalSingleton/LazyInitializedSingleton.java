package com.bridgelabz.creationalSingleton;

/**Purpose: This is implementation of LAzy initialization singleton class.
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
public class LazyInitializedSingleton {

	public static void main(String[] args) {
		

		//System.out.println(instance);
	}

	private static LazyInitializedSingleton instance;

	//constructor
	private LazyInitializedSingleton() {
		System.out.println(getInstance());
		System.out.println(getInstance());
	}

	public static LazyInitializedSingleton getInstance() {
		if (instance == null) {
			
			//instance will be created at request time
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
}
