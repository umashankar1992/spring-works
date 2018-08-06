package com.training.singleton;

public class SingletonClient01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton=Singleton.getInstance();
		System.out.println(singleton.hashCode());
		singleton=Singleton.getInstance();
		// shall give the storage location
		System.out.println(singleton.hashCode());
		singleton=Singleton.getInstance();
		
		// shall give the storage location
		System.out.println(singleton.hashCode());

	}

}
