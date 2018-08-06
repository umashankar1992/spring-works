package com.training.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	private List<Service> services;
	public Cache(){
		
		services =new ArrayList<Service>();
		
	}
	public Service getService(String servicename){
		for (Service service : services) {
			if (service.getname().equalsIgnoreCase(servicename)) {
				System.out.println("return Cached Service"+servicename+"  object");
				
			}
			
		}
		return null;
	}

	public void addService(Service newService){
		boolean exists=false;
		for (Service service2 : services) {
			if (service2.getname().equalsIgnoreCase(newService.getname())) {
				exists=true;
				
			}
			
		}
		if (!exists) {
			services.add(newService);
			
		}
		
	}
}
