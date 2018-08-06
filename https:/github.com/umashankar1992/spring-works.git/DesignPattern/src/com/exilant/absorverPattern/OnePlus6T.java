package com.exilant.absorverPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class OnePlus6T implements IObeservable{
	
	private List<IObserver> users;
	private boolean isArrived;
	public OnePlus6T(){
		users =new ArrayList<IObserver>();
		
	}
	public void addUser(IObserver observer){
		users.add(observer);
	}
	public void remove(IObserver observer){
		users.remove(observer);
		
	}
	public void notifyObserver(){
		for (IObserver observer : users) {
			
			System.out.println(users);
			
		}
	}
	
	public boolean isArrived(){
		return isArrived;
	}
	
	
	// all those people who are are in the
	
	public void setArrived(boolean b) {
		this.isArrived=isArrived;
		notifyObserver();
		// TODO Auto-generated method stub
		
	}

}
