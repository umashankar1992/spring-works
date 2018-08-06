package com.training.factory;

public class FactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=Car.getCar( CarName.AUDI);
		car.drive();
		car=Car.getCar(CarName.MARUTI);
		car.drive();

	}

}
