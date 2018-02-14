package com.bridgelabz.creationalSingleton;

import java.lang.reflect.Constructor;

/**Purpose: This is implementation of reflection test to break singleton property.
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
public class ReflectionSingletonTest {

    public static void main(String[] args) {
    	
    	//get object of Eager
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println(instanceOne.getInstance());
        //System.out.println(instanceTwo.getInstance());
        
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}