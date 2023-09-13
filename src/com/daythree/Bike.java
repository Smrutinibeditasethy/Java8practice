package com.daythree;

public class Bike implements Vehicle {

	@Override
	public void startVehicle() {
		System.out.println("The bike started....");
		
	}
	
	@Override
	public void addWheel() {
		System.out.println("In bike the wheel is added");
	}
	
	@Override
	public void addEngine() {
		System.out.println("The bike engine is added");
	}
	
public static void main(String[] args) {
	Bike b1 = new Bike();
	b1.startVehicle();
	Vehicle.clean();
	b1.addEngine();
	b1.addWheel();
}
}
