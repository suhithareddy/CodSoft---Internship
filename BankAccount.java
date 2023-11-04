package com.tap.TASK3;

public class BankAccount implements ATM{
	
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount > 0 && amount <=balance) {
			balance-=amount;
			System.out.println("withdrawl of "+ amount + " successful , New balance :" + balance);
		}else {
			System.out.println("withdrawl failed . Insufficient balance or invalid amount");
		}
		
	}
	
	@Override
	public void deposit(double amount) {
		if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
	}
	
	@Override
	public double checkBalance() {
		return balance;
	}	

}
