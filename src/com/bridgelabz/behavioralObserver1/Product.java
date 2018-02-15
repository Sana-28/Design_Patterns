package com.bridgelabz.behavioralObserver1;

import java.util.ArrayList;
import java.util.Observer;

public class Product implements Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String productName;
	private String productType;
	String availability;

	public Product(String productName, String productType, String availability) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.availability = availability;
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		notifyObservers();
	}
	
	@Override
	public void register(Person newPerson) {
		// TODO Auto-generated method stub
		observers.add((Observer) newPerson);
	}

	@Override
	public void unRegister(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		System.out.println("Notifying to all the subscribers when product became available");
		for (Observer ob : observers) {
			ob.update(null, this.availability);
		}

	}

	@Override
	public void register(Observer observer) {
		// TODO Auto-generated method stub
		
	}
}
