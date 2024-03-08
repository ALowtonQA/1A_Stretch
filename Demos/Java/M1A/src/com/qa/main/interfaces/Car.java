package com.qa.main.interfaces;

public class Car extends Vehicle implements MusicPlayer {

	private double trunkCapacity;
	
	public Car(String colour, int numOfWheels, int numOfDoors, double trunkCapacity) {
		super(colour, numOfWheels, numOfDoors);
		this.trunkCapacity = trunkCapacity;
	}

	public double getTrunkCapacity() {
		return trunkCapacity;
	}

	public void setTrunkCapacity(double trunkCapacity) {
		this.trunkCapacity = trunkCapacity;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fastForward(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Rewind(int amount) {
		// TODO Auto-generated method stub
		
	}
}
