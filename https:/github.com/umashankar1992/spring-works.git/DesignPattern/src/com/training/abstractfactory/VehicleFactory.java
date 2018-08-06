package com.training.abstractfactory;

public class VehicleFactory extends AbstractFactory{
	
	public IVehicle getVehicle(String vehicle){
		if (vehicle.equals("car")) {
			return new Car();
			
		}
		else if(vehicle.equals("truck")){
			return new Truck();
		}
		return null;
	}
	public IColor getColor(String color){
		return null;
	}

}
