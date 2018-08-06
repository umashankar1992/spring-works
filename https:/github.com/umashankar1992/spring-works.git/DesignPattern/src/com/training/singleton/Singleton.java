package com.training.singleton;

import java.io.Serializable;

// the singleton says there should be only one project
//to do so we will have the variable AS static so that you can have only
//one referencve , in singlrtyon we can have two types 
//1.egier singleton 2.lazy singleton
// one copy is always kept in jvm
public class Singleton implements Serializable {
	
	
	private static final Singleton intance=new Singleton();
	// shall have the private constructor so that , itis not accessable outside
	//the class
	
	private Singleton(){
		
		
		
		
		System.out.println("The constructor is called");
	}
	public static Singleton getInstance(){
		return intance;
		
	}
	// to stop creating an instance if already exists
	// this is only for 
	protected Object readResolve() {
		return getInstance();
		
	}

}
