package com.training.abstractfactory;

public interface IVehicle {
void move();
void speed(int maxSpeed);
void paint(String color);
}

class Car implements IVehicle{
	public void move(){
		System.out.println("car is moving");
	}
	public void speed(int maxSpeed){
		System.out.println("max speed is"+maxSpeed);
		
	}
	public void paint(String color){
		System.out.println("car is painting is"+color);
	}
}
class Truck implements IVehicle{
	public void move(){
		System.out.println("truck is moving");
	}
	public void speed(int maxSpeed){
		System.out.println("max speed is :"+maxSpeed);
	}
	public void paint(String color){
		System.out.println("truck is painting"+color);
	}
}