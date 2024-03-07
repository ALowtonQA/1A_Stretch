package com.qa.main.inheritance;

public class Dog extends Animal {

	private float tailLength;

	public Dog(int age, float weight, String habitat, float tailLength) {
		super(age, weight, habitat);
//		setAge(age);
//		setWeight(weight);
//		setHabitat(habitat);
		this.tailLength = tailLength;
	}

	public float getTailLength() {
		return tailLength;
	}

	public void setTailLength(float tailLength) {
		this.tailLength = tailLength;
	}
}
