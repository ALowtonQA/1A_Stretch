package com.qa.main.inheritance;

public class Snake extends Animal {

	private boolean venomous;

	public Snake(int age, float weight, String habitat, boolean venomous) {
		super(age, weight, habitat);
		this.venomous = venomous;
	}

	public boolean isVenomous() {
		return venomous;
	}

	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Hiss");
	}
}
