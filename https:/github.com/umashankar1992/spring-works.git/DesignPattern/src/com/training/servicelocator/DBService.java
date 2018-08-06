package com.training.servicelocator;

public class DBService implements Service {
	public String getname(){
		return "db";
		
	}
	public void execute(){
		System.out.println("We are executing DB Service");
	}

}
