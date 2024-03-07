package com.qa.main.inheritance;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		Dog bob = new Dog(17, 10.5f, "House", 5.5f);
		Snake tom = new Snake(5, 5.5f, "jungle", true);
		
		ArrayList<Animal> myAnimals = new ArrayList<>();
		
		myAnimals.add(bob);
		myAnimals.add(tom);
		
		for (Animal animal : myAnimals) {
			animal.makeNoise();
		}
	}
}
