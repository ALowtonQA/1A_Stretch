package com.qa.main.labs.lab13;

public class Account {

	private int id;
	private double balance;
	private String owner;
	
	public Account(int id, double balance, String owner) {
		this.id = id;
		this.balance = balance;
		this.owner = owner;
	}
	
	public void withdraw(double amount) {
		if (this.balance - amount < 0) {
			throw new IllegalArgumentException("Insufficient Balance");
		} else {
			this.balance -= amount;
		}
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void close() {
		System.out.printf("Account %d is closed\n", this.id);
	}
	
	public String getDetails() {
		return String.format("Account ID: %d\nAccount Owner: %s\nAccount Balance: £%.2f\n", this.id, this.owner, this.balance);
	}
}
