package com.bridgelabz.behavioralObserver1;

public class Person implements Observer {

	String personName;

	public Person(String personName) {
		this.personName = personName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public void update(String availability) {
		// TODO Auto-generated method stub
		System.out.println("Hello "+personName+", Product is now "+availability+" on flipkart");

	}

}
