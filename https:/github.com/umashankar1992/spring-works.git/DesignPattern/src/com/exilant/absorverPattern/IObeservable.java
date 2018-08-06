package com.exilant.absorverPattern;

import java.util.Observer;

public interface IObeservable {
	public void addUser(IObserver observer);
	public void remove(IObserver observer);
	
	// all those people who are are in the
	public void notifyObserver();

}
