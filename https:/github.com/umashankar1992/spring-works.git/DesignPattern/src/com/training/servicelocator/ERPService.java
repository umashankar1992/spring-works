package com.training.servicelocator;

public class ERPService implements Service {
	public String getname(){
		return "erp";
		
	}
	public void execute(){
		System.out.println("Executing ERP Service");
		
	}

}
