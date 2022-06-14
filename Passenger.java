package com.BeginnersProject.Collections;

public class Passenger {
	private String passengerName;
	private int passengerId;
	private int age;
	private BankAccount bankAccount;

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(String passengerName, int passengerId, int age, BankAccount bankAccount) {
		super();
		this.passengerName = passengerName;
		this.passengerId = passengerId;
		this.age = age;
		this.bankAccount = bankAccount;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

}
