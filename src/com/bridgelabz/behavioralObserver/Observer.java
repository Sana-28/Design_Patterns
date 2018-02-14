package com.bridgelabz.behavioralObserver;

public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}