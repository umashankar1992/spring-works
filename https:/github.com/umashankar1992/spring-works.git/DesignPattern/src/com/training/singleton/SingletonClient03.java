package com.training.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// program to access Singleton(Eager) through reflection
public class SingletonClient03 {
	public static void main(String[] args) throws InstantiationException,IllegalAccessException,IllegalArgumentException,InvocationTargetException{
		Singleton singletonI1=Singleton.getInstance();
		Singleton singletonI2=null;
		Singleton singletonI3=null;
		
		
		
		Constructor[] constructor=Singleton.class.getDeclaredConstructors();
		
		
		
		for (Constructor constructor1 : constructor) {
			// With this statement we can access private method 
			// or constructor
			
			constructor1.setAccessible(true);
			singletonI1=(Singleton)constructor1.newInstance();
			singletonI2=(Singleton)constructor1.newInstance();
			singletonI3=(Singleton)constructor1.newInstance();
			break;
			
		}
		System.out.println("Instance one:"+constructor.hashCode());
		System.out.println("Instance 2:"+constructor.hashCode());
		System.out.println("Instance3:"+constructor.hashCode());
		System.out.println("Instance4:"+constructor.hashCode());
	}
	
		
	}


