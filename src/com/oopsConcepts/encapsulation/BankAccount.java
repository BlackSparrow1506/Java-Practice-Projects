package com.oopsConcepts.encapsulation;

public class BankAccount {
	private String accHolderName;
	private double balance;

	public BankAccount(String accHolderName, double initialBalance) {
		this.accHolderName = accHolderName;
		if (initialBalance >= 0) {
			this.balance = initialBalance;
		} else {
			System.out.println("Initial balance cannot be negative.");
		}

	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Method to deposit money
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}

	// Method to withdraw money
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw: " + amount);
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}

}
