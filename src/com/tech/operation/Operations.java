package com.tech.operation;

import java.util.Scanner;

import com.tech.model.Customer;

public class Operations {

	Customer c=new Customer();
	
	Scanner scanner=new Scanner(System.in);
	
	public void createAccount() {
		
	System.out.println("Enter Account Name:");
			c.setAccountName(scanner.next());
	System.out.println("Enter Customer Name: ");	
			c.setCustomerName(scanner.next());
	System.out.println("Enter Address: ");
			c.setAddress(scanner.next()); 
	System.out.println("Enter Account Number: ");
			c.setAccountNumber(scanner.next()); 
	System.out.println("Enter UserName: ");
			c.setUserName(scanner.next());
	System.out.println("Enter Password: ");
			c.setPassword(scanner.next());
	System.out.println("Enter deposit money: ");
			c.setBalanceString(scanner.next());
	
}
	public void showAccountDetails() {
		
		c.getAccountName();
		c.getAccountNumber();
		c.getAddress();
		c.getBalanceString();
		c.getCustomerName();
		c.getUserName();
		c.getPassword();
		
	}
	
	public void depositMoney() {
		
		c.setBalanceString(scanner.next());
		
	}
	
	public void balanceEnquiry() {
		
		
		c.getBalanceString();
		
	}
	
}

