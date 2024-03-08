package com.qa.main.interfaces;

public class Vehicle {

	private String colour;
	private int numOfWheels;
	private int numOfDoors;

	public Vehicle(String colour, int numOfWheels, int numOfDoors) {
		this.colour = colour;
		this.numOfWheels = numOfWheels;
		this.numOfDoors = numOfDoors;
	}

	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public int getNumOfWheels() {
		return numOfWheels;
	}
	
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	
	public int getNumOfDoors() {
		return numOfDoors;
	}
	
	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
}
