package com.daythree;

public class Bus implements Vehicle {

	@Override
	public void startVehicle() {
		System.out.println("The bus started....");
	}
	
	@Override
	public void addWheel() {
		System.out.println("In bus the wheel is added");
	}
	
	@Override
	public void addEngine() {
		System.out.println("The bus engine is added");
	}
	
public static void main(String[] args) {
	Bus b = new Bus();
	b.startVehicle();
	Vehicle.clean();
	b.addEngine();
	b.addWheel();
}
}
