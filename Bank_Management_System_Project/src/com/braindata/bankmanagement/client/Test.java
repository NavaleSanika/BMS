package com.braindata.bankmanagement.client;
import java.util.*;

import com.braindata.bankmanagement.service.*;
import com.braindata.bankmanagement.serviceImpl.*;

public class Test {
	private static Scanner sc;

	public static void main(String[] args) {
		Rbi bank =new Sbi();
		Scanner scanner= new Scanner(System.in);
		
		do{
		System.out.println("1.Create Account");
		System.out.println("2.Display Account Details");
		System.out.println("3.Deposite Money");
		System.out.println("4.Withdraw Money");
		System.out.println("5.Check Balance");
		System.out.println("Enter your Choice:");
		int choice=scanner.nextInt();
		
		
		
		switch(choice) {
		case 1:
			bank.createAccount();
		break;
		case 2:
			bank.displayAllDetails();
		break;
		case 3:
			bank.depositeMoney();
		break;
		case 4:
			bank.withdrawal();
		break;
		case 5:
			bank.balanceCheck();
		break;
		default:
			System.out.println("Enter Valid Input");
		}
		}while(true);
		
	
		
	}
}
