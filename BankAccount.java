package com.BeginnersProject.Collections;

public class BankAccount {
	private int actNumber;
	private int actBalance;

	public BankAccount(int actNumber, int actBalance) {
		super();
		this.actNumber = actNumber;
		this.actBalance = actBalance;
	}

	public int getActNumber() {
		return actNumber;
	}

	public void setActNumber(int actNumber) {
		this.actNumber = actNumber;
	}

	public int getActBalance() {
		return actBalance;
	}

	public void setActBalance(int actBalance) {
		this.actBalance = actBalance;
	}

	public void deposit(int depositAmount) {
		this.actBalance += depositAmount;
	}

	public void withDraw(int withDrawAmount) {
		this.actBalance -= withDrawAmount;
	}

	public void showBalance() {
		System.out.println("The account Balance is " + this.actBalance);
	}

}
