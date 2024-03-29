package com.qa.main.objects;

public class Program {

	public static void main(String[] args) {
		
		Car myCar = new Car("BMW", 0); // custom car

		Car bensCar = new Car("Skoda", 10);  // custom car
		
		Car robsCar = new Car("Audi");
		
		System.out.println("The count is: " + Car.count);
		
		System.out.println("The make of my car is: " + myCar.getMake());
		System.out.println("The make of Matt's car is: " + bensCar.getMake());
		
		System.out.println("The speed of Tom's car is: " + robsCar.getSpeed());

		myCar.accelerate();
		myCar.accelerate();
		myCar.accelerate();
		myCar.accelerate();
		
		System.out.println("The speed of my car is: " + myCar.getSpeed());
		System.out.println("The speed of matt's car is: " + bensCar.getSpeed());
		
		myCar.stop();
		
		System.out.println("The speed of my car is: " + myCar.getSpeed());
		
		Account anoushAccount = new Account();
		anoushAccount.setBalance(5000.00);
		
		System.out.println("My balance is: " + anoushAccount.getBalance());
		
	}
}
