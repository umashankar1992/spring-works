package com.training.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageInputStream;

// to persist the data to file with oos.OIS
public class SingletonClient04 {

	public static void main(String[] args)throws FileNotFoundException,IOException,ClassNotFoundException {
		// TODO Auto-generated method stub
		Singleton singleton=Singleton.getInstance();
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("sample.ser"));
		
		out.writeObject(singleton);
		System.out.println("object saved with hashcode"+singleton);
		out.close();
		//////deserilze/////
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("sample.ser"));
		Singleton singleton2=(Singleton) ois.readObject();
		ois.close();
		System.out.println("Object recived with hashCode"+singleton2);
		

	}

}
