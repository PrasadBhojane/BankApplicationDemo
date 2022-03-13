package com.bankapp.controller;

import java.util.*;

public class BankApp2 {
	public static void main(String[] args) {
		SavingsAccount2 obj1 = new SavingsAccount2("Rohan", "1001");
		obj1.showMenu();
	}
}

class SavingsAccount2 {
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;

	public SavingsAccount2(String cname, String cid) {
		customerName = cname;
		customerID = cid;
	}

	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}

	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited:" + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn:" + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occured");
		}
	}

	/*
	 * '/0' null character used to initialize char
	 */
	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome " + customerName);
		System.out.println("Your ID is " + customerID);
		System.out.println('\n'); // line break
		System.out.println("A = Check balance");
		System.out.println("B = Deposit");
		System.out.println("C = Withdraw");
		System.out.println("D = Previous transaction");
		System.out.println("E = Exit");

		do {
			
			System.out.println("Enter an option");
			option = scanner.next().charAt(0);
			System.out.println('\n');

			switch (option) {

			case 'A':
				System.out.println("Balance = " + balance);
				System.out.println('\n');
				break;

			case 'B':
				System.out.println("Enter an amount to deposit:");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println('\n');
				break;

			case 'C':
				System.out.println("Enter an amount to withdraw:");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println('\n');
				break;

			case 'D':
				getPreviousTransaction();
				System.out.println('\n');
				break;
				
			default:
				System.out.println("Invalid option!.. please choose again");
				break;
			}
		} 
		while(option !='E');
		System.out.println("Thank you.. Visit again");
	}
}
/**
 * not getting required output
 * code as it is form youtube vid..
 */
