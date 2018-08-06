package com.training.abstractfactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory vehicleFactory=FactoryProducer.getFactory("vehicle");
		IColor  redColor=FactoryProducer.getFactory("color").getColor("red");
		IVehicle forCar=vehicleFactory.getVehicle("car");
		forCar.move();
		forCar.speed(120);
		forCar.paint("redcolor");
		
		IVehicle manTruck=vehicleFactory.getVehicle("car");
		manTruck.move();
		manTruck.speed(65);
		manTruck.paint("blue color");
		
		
		
		

	}

}
