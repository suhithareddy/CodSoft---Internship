package com.tap.TASK3;
import java.util.Scanner;

public class TASK3 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 BankAccount atm = new BankAccount(1000.0);
		 
		 while (true) {
			 System.out.println("Options:");
	         System.out.println("1. Check Balance");
	         System.out.println("2. Deposit");
	         System.out.println("3. Withdraw");
	         System.out.println("4. Exit");
	         System.out.print("Select an option: ");
	         int choice = scanner.nextInt();

	         switch(choice) {
	         case 1:
                 System.out.println("Current balance: " + atm.checkBalance());
                 break;
             case 2:
                 System.out.print("Enter the deposit amount: ");
                 double deposit = scanner.nextDouble();
                 atm.deposit(deposit);
                 break;
             case 3:
                 System.out.print("Enter the withdrawal amount: ");
                 double withdraw = scanner.nextDouble();
                 atm.withdraw(withdraw);
                 break;
             case 4:
                 System.out.println("Thank you for using the ATM.");
                 scanner.close();
                 System.exit(0);
             default:
                 System.out.println("Invalid choice. Please select a valid option.");
	         }
	         System.out.println();
		 }
	}
}
         
