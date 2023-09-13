package com.daythree;

public class Car implements Vehicle {

	@Override
	public void startVehicle() {
		System.out.println("The car started....");
	}
		
	@Override
	public void addWheel(){
		System.out.println("The wheel is added..");
	}
	
	@Override
	public void addEngine(){
		System.out.println("The engine is added");
	}
	
	
	public static void main(String[] args) {
		Car c = new Car();
		Vehicle.clean();
		c.startVehicle();
		c.addWheel();
		c.addEngine();
	}

}
