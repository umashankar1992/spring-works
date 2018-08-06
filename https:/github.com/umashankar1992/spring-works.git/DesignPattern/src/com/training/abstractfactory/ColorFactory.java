package com.training.abstractfactory;

public class ColorFactory extends AbstractFactory {
	// we shall not have any implementation for vehicle method
	
	public IVehicle getVehicle(String cehicle){
		return null;
	}
public 	 IColor getColor(String color){
	if (color.equals("red")) {
		return new Red();
		
	} 
		
	 else if(color.equals("blue"))  {
		 return new Blue();

	}
	return null;

	}
}

