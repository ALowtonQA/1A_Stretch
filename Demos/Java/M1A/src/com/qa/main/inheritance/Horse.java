package com.qa.main.inheritance;

public class Horse extends Animal {

	private float maneLength;

	public Horse(int age, float weight, String habitat, float maneLength) {
		super(age, weight, habitat);
		this.maneLength = maneLength;
	}

	public float getManeLength() {
		return maneLength;
	}

	public void setManeLength(float maneLength) {
		this.maneLength = maneLength;
	}

	@Override
	public void makeNoise() {
		System.out.println("Neiiiighh");
	}
}
