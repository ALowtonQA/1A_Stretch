package com.qa.main.inheritance;

public class Animal {
	
	private int age;
	private float weight;
	private String habitat;
	
	public Animal(int age, float weight, String habitat) {
		super(); // This is implicit, you dont need it (because super class has default constructor)
		this.age = age;
		this.weight = weight;
		this.habitat = habitat;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public void makeNoise() {
		System.out.println("Makes noise");
	}
}
