package com.bridgelabz.behavioralObserver1;

import java.util.Observer;

public interface Subject {

	public void register(Observer observer);
	public void unRegister(Observer observer);
	public void notifyObservers();
	//void register(String string);
	void register(Person newPerson);
	
	//public Object getUpdate(Observer object);
}
