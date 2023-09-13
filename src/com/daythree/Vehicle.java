package com.daythree;

public interface Vehicle {
public abstract void startVehicle();
public default void addWheel() {
}
public default void addEngine() {
}
public static void clean() {
	System.out.println("cleaning completed...");
}
}
