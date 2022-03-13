package com.bankapp.services;

import java.util.Scanner;

import com.bankapp.dto.SavingsAccount;

public class BankServices {

	SavingsAccount accountDto = new SavingsAccount("Yatish", "USER-1");
	
	String customerName = accountDto.getCustomerName();
	String customerID = accountDto.getCustomerID();
	int balance = accountDto.getBalance();
	int previousTransaction = accountDto.getPreviousTransaction();
	
	int deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
		return balance;
	}

	int withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
		return balance;
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
	
	public void showMenu() {
		char option = '\0';
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Welcome " + customerName);
			System.out.println("Your ID is " + customerID);
			System.out.println('\n'); // line break
			displayOptions();

			do {
				System.out.println("==================");
				System.out.println("Enter an option :");
				System.out.println("==================");
				option = scanner.next().charAt(0);
				System.out.println('\n');

				switch (option) {

				case 'A':
					System.out.println("Balance = Rs." + balance);
					displayOptions();
					System.out.println('\n');
					break;

				case 'B':
					System.out.println("Enter an amount to deposit: Rs.");
					int amount = scanner.nextInt();
					int updatedBalance = deposit(amount);
					System.out.println("Amount deposited successfully: Rs."+amount);
					System.out.println("Updated balance is: Rs."+updatedBalance);
					System.out.println('\n');
					break;

				case 'C':
					System.out.println("Enter an amount to withdraw: Rs.");
					int amount2 = scanner.nextInt();
					int updatedBalanceW = withdraw(amount2);
					System.out.println("Updated balance is: Rs."+updatedBalanceW);
					System.out.println("Amount withdrawl successfully: Rs." +amount2);
					System.out.println('\n');
					break;

				case 'D':
					getPreviousTransaction();
					System.out.println('\n');
					break;
					
				case 'E':
					System.out.println("Thank you.. Visit again");
					break;
					
				default:
					System.out.println("Invalid option!.. please choose again");
					break;
				}
			} 
			while(option !='E');
		}

		System.out.println("Please visit our nearby Branch for more details..");
	}

	private void displayOptions() {
		System.out.println("A = Check balance");
		System.out.println("B = Deposit");
		System.out.println("C = Withdraw");
		System.out.println("D = Previous transaction");
		System.out.println("E = Exit");
	}
	
}
