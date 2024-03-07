package com.qa.main.objects;

public class Car {

	// Static properties
	public static int count;
	
	// Instance properties
	private String make;
	private int speed;
	
	public Car(String make) {
		this.make = make;
		this.speed = 0;	
//		this(make, 0); - this is the same as above
		
		count++;
	}
	
	public Car(String make, int speed) {
		this.make = make;
		this.speed = speed;
		count++;
	}

	// Getters and Setters
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// Custom Instance methods
	public void start() {
		System.out.println("Car starting");		
	}
	
	public void stop() {
		System.out.println("Stopping car!");
		speed = 0;
	}
	
	public void accelerate() {
		speed += 2;
	}
}
