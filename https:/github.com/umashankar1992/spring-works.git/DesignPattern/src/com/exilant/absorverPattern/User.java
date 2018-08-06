package com.exilant.absorverPattern;

public class User implements IObserver {
	
	
	
	private IObeservable obeservable=null;
	private String name;
	
	public User(IObeservable obeservable, String name) {
		super();
		this.obeservable = obeservable;
		this.name = name;
	}
public void buyMobile(){
	System.out.println("Hurry, i've bought OnePlus6T,by "+name);
}
	public void update(){
		buyMobile();
	}
	public void unSubscriber(){
		obeservable.remove(this);
	}
	@Override
	public String toString() {
		return "User [obeservable=" + obeservable + ", name=" + name + "]";
	}

}
