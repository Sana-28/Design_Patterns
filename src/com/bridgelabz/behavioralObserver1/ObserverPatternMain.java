package com.bridgelabz.behavioralObserver1;

public class ObserverPatternMain {
	
	public static void main(String[] args) {
        Person newPerson=new Person("Abc");
        
        Product samsungMobile=new Product("Samsung", "Mobile", "Not available");
        
        //When you opt for option "Notify me when product is available".Below registerObserver method
        //get executed        
		samsungMobile.register(newPerson);;
       // samsungMobile.register(null);
        
        //Now product is available
        samsungMobile.setAvailability("Available");
        
    }
}