package eduSMG;

import java.util.Scanner;

public class ATM {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account[] acc = new Account[10];
		Scanner sc = new Scanner(System.in);
		
		for (int i =1; i < 10; i++) {
			acc[i] = new Account(i, 100.0);
		}
		
		while (true) {
			System.out.println("Enter ID: ");
			int id = sc.nextInt();
			
			if(id > 9 || id < 0) {System.out.println("Please enter a valid ID");}
			else {
				System.out.println(" Enter 1 to check your balance \n Enter 2 to withdraw a sum \n Enter 3 to deposit a sum \n Enter 4 to leave the menu");
				int enteredNumber = sc.nextInt();
				
				if (enteredNumber == 1) {
					System.out.println("Your balance is " + acc[id].getBalance());
				} else if (enteredNumber == 2) {
					System.out.println("What sum do you wish to withdraw?");
					double sumToWithdraw = sc.nextDouble(); 
					acc[id].withdraw(sumToWithdraw);
					System.out.println("Succesful transaction.Your balance is " + acc[id].getBalance());
				} else if (enteredNumber == 3) {
					System.out.println("What sum do you wish to deposit?");
					double sumToDeposit = sc.nextDouble();
					acc[id].deposit(sumToDeposit);
					System.out.println("Succesful transaction. Your balance is " + acc[id].getBalance());
				} else if (enteredNumber == 4) {
					System.out.println("You have left the main menu.");
				} else {System.out.println("Please enter a valid number from the menu.");}
			}
		}
	}

}
