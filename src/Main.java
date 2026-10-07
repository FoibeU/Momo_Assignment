import sample.Student;

import javax.swing.*;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int choice;
	
	
	do {
		System.out.println("**************MTN MOMO MENU*******************");
		mainMenu();
		
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		
		switch (choice) {
			case 0: {
				voicePack(sc);
				System.out.println("Enter your choice : ");
				choice = sc.nextInt();
				break;
			}
			
			case 1: {
				sendMoney(sc);
				System.out.print("Enter your choice : ");
				choice = sc.nextInt();
				switch (choice) {
					case 1:
						double currentBalance = 2000;
						momoUser(sc, currentBalance);
						
						break;
					case 2:
						sendEkash(sc);
						break;
					case 3:
						internationalTransfer(sc);
						System.out.print("Enter your choice : ");
						choice = sc.nextInt();
				}
				break;
			}
			
			case 2: {
				
				buy(sc);
				break;
			}
			case 99: {
				break;
			}
			
			
			default:
				System.out.println("Invalid choice. Try again");
			
		}
		
		System.out.println("Thank you for using MTN");
		
		
	} while (choice != 99);
	
	
}

public static void mainMenu() {
	System.out.println("0. MTN Packs");
	System.out.println("1. Send Money");
	System.out.println("2. Buy");
	System.out.println("3. Pay Bill");
	System.out.println("4. Bank services");
	System.out.println("5. Loans and savings ");
	System.out.println("6. My momo account");
	System.out.println("7. Pending Approvals");
	System.out.println("8. Momo pay");
	System.out.println("99. Exit");
	
}

public static void voicePack(Scanner sc) {
	System.out.println("1. Buying Airtime , VoicePack and Databundles");
	System.out.println("99. Go back");
}

public static void sendMoney(Scanner sc) {
	System.out.println("1.Momo Users");
	System.out.println("2.Send to Ekash");
	System.out.println("3. International Remittance");
	System.out.println("4.Cancel Voucher");
	System.out.println("5. Display voucher ");
	System.out.println("6.List Active voucher ");
}

public static void momoUser(Scanner sc, double currentBalance) {
	sc.nextLine();
	String recipientNumber;
	System.out.println("enter the recipient number");
	recipientNumber = sc.nextLine();
	System.out.println("enter the amount");
	double amountToSend;
	amountToSend = sc.nextDouble();
	if (amountToSend <= 1000) {
		validateTransaction(currentBalance, amountToSend, recipientNumber);
	} else if (amountToSend > 1000 && amountToSend <= 1500) {
		currentBalance = currentBalance - 20;
		validateTransaction(currentBalance, amountToSend, recipientNumber);
	} else {
		currentBalance = currentBalance - 100;
		validateTransaction(currentBalance, amountToSend, recipientNumber);
	}
	
	
}

public static void validateTransaction(double currentBalance, double amountToSend, String recipientNumber) {
	if (currentBalance > amountToSend) {
		currentBalance = currentBalance - amountToSend;
		System.out.println("You have sent: " + amountToSend + " to: " + recipientNumber + " your current balance is:" + currentBalance);
	} else {
		System.out.println("Insufficient balance");
	}
}

public static void sendEkash(Scanner sc) {
	System.out.println("enter the recipient number");
	
}

public static void internationalTransfer(Scanner sc) {
	System.out.println("1. To mobile number");
	System.out.println("2. other wallets");
	System.out.println("3. to banks");
	System.out.println("4. Pay international merchant");
	System.out.println("5. exit");
}

public static void buy(Scanner sc) {
	System.out.println("1. Buying Airtime , VoicePack and Databundles");
	System.out.println("2. Electricity");
	System.out.println("3. International subscription");
	System.out.println("4. Solar");
	System.out.println("5. Pay transport fare");
	System.out.println("6. Exit");
}

}
