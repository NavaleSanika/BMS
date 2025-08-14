package com.braindata.bankmanagement.serviceImpl;
import com.braindata.bankmanagement.model.*;
import java.util.Scanner;

import com.braindata.bankmanagement.service.Rbi;

public class Sbi implements Rbi{
	Scanner sc=new Scanner(System.in);
	Account account=new Account();

	@Override
	public void createAccount() {
		
		System.out.println("Create Account No:");
		int accNo=sc.nextInt();
		account.setAccNo(accNo);
        System.out.println("Enter Name:");
		String name=sc.next();
		account.setName(name);
		System.out.println("Enter MobileNo:");
		long mobNo=sc.nextLong();
		account.setMobNo(mobNo);
		System.out.println("Enter AdharNo:");
		long adharNo=sc.nextLong();
		account.setAdharNo(adharNo);
		System.out.println("Enter Gender:");
		String gender=sc.next();
		account.setGender(gender);
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		account.setAge(age);
		System.out.println("Enter Balance:");
		double balance=sc.nextDouble();
		account.setBalance(balance);
	     
	     	     
		System.out.println("-----Account Created Successfully----- \n\n");
		
			     
	  }

	
    @Override
	public void displayAllDetails() {
    	
    	if(account!=null) {
 		System.out.println("All Details:");
		System.out.println("Account Number: "+account.getAccNo());
		System.out.println("Name: "+account.getName());
		System.out.println("Mobile No.: "+account.getMobNo());
		System.out.println("Adhar No.: "+account.getAdharNo());
		System.out.println("Gender: "+account.getGender());
		System.out.println("Age: "+account.getAge());
		System.out.println("Total Balance: "+account.getBalance());
		System.out.println("\n\n");
    	}else {
    		System.out.println("No Account Found \n\n");
    	}
		
		
	}

	@Override
	public void depositeMoney() {
		System.out.println("Deposite Money");
		
            System.out.println("Enter amount you want to deposit:");
            double amount = sc.nextDouble();
            if (amount>0){
                account.setBalance(account.getBalance()+amount);
                System.out.println("---Amount Deposited Successfully--- \n New Balance: " +account.getBalance());
                System.out.println("\n\n");
            } else {
                System.out.println("Enter Valid Amount");
            }
        
	}

	@Override
	public void withdrawal() {
		System.out.println("Withdrawal");
		
            System.out.println("Enter amount you want to withdraw:");
            double amount = sc.nextDouble();
            if (amount>0&&amount<= account.getBalance()) {
                account.setBalance(account.getBalance()-amount);
                System.out.println("---Amount Withdrawn Successfully--- \n Balance available: " +account.getBalance());
                System.out.println("\n\n");
            } else {
                System.out.println("Balance Not Available");
            }
        
    }
		
	

	@Override
	public void balanceCheck() {
		System.out.println("Balance Check");
		
            System.out.println("Current Balance: "+ account.getBalance());
            System.out.println("\n\n");
       
    }
		
	}
	

	
	
	


