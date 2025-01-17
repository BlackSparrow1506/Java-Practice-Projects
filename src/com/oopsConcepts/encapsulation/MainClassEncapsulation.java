package com.oopsConcepts.encapsulation;

public class MainClassEncapsulation {

	public static void main(String[] args) {
		// Creating an instance of BankAccount
		BankAccount acc = new BankAccount("Gauri Langote", 1000000000);
		 // Accessing and modifying data through getters and setters
        System.out.println("Account Holder: " + acc.getAccHolderName());
        System.out.println("Initial Balance: " + acc.getBalance());

        // Depositing and withdrawing money
        acc.deposit(500);
        System.out.println("Updated Balance: " + acc.getBalance());

        acc.withdraw(300);
        System.out.println("Updated Balance: " + acc.getBalance());

        // Changing the account holder's name
        acc.setAccHolderName("Langote Gauri");
        System.out.println("Updated Account Holder: " + acc.getAccHolderName());
	}

}
