package com.bankapp.controller;

import com.bankapp.services.BankServices;

public class BankApp {
	public static void main(String[] args) {
		BankServices bankServices = new BankServices();
		bankServices.showMenu();
	}
}
