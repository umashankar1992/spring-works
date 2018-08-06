package com.exilant.absorverPattern;

public class Client {
	public static void main(String[] args) {
		
		IObeservable obeservable=new OnePlus6T();
		IObserver user1=new User(obeservable, "kumar");
		IObserver user2=new User(obeservable, "Anuj");
		IObserver user3=new User(obeservable, "Deepak");
		IObserver user4=new User(obeservable, "Mnuj");
		
		obeservable.addUser(user1);
		obeservable.addUser(user2);
		obeservable.addUser(user3);
		obeservable.addUser(user4);
		((OnePlus6T)obeservable).setArrived(true);
		System.out.println("-------------------");
		
		
	}

}
