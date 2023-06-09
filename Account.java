
package com.MyProject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	private int CustomerNumber;
	private int pinNumber;
	private double checkingBalance=0;
	private double savingbalance=0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("#0.00");
	
	public int setCustomerNumber(int customerNumber) {
		this.CustomerNumber=customerNumber;
		return CustomerNumber;
	}
	public int getCustomerNumber() {
		return CustomerNumber;
	}
	public int setPinNumber(int pinNumber) {
		this.pinNumber=pinNumber;
		return pinNumber;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public double getSavingBalance(){
		return checkingBalance;
	}
	public double calcCheckingWithraw(double amount) {
		checkingBalance=(checkingBalance-amount);
		return checkingBalance;	
	}
	public double calcSavingWithdraw(double amount) {
		savingbalance=(savingbalance+amount);
		return savingbalance;
	}
	public double calcCheckingDeposite(double amount) {
		checkingBalance=(checkingBalance+amount);
		return checkingBalance;
	}
	public double calcSavingDeposite(double amount) {
		savingbalance=(savingbalance+amount);
		return savingbalance;
	}
	
	public void getCheckingwithdrawInput() {
		System.out.println("Checking Account Balance:"+moneyFormat.format(checkingBalance));
		System.out.println("Account you wanted to withdraw from checking Account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance-amount)>=0) {
			calcCheckingWithraw(amount);
			System.out.println("New checking Account Balance: "+ moneyFormat.format(checkingBalance));
		}else {
			System.out.println("Balance Cannot be Negative."+"\n");
		}
		}
	public void getSavingWithdrawInput() {
			System.out.println("Saving Account Balance:"+ moneyFormat.format(savingbalance));
			System.out.println("Amount you to withdraw from saving Account: ");
			double amount = input.nextDouble();
			
			if((savingbalance-amount)>=0) {
				calcCheckingWithraw(amount);
				System.out.println("New Saving Account Balance:"+ moneyFormat.format(savingbalance));
				}else {
					System.out.println("Balance Cannot be Negative."+"\n");
				}
	}
	
	public void getCheckingDepositeInput() {
			System.out.println("Checking Account Balance:"+moneyFormat.format(checkingBalance));
			System.out.println("Amount you want to deposit from Checking Account: ");
			double amount = input.nextDouble();
			
			if((checkingBalance+amount)>=0)
			{
				calcCheckingDeposite(amount);
				System.out.println("New Checking Account Balance: "+moneyFormat.format(checkingBalance));
			}else {
				System.out.println("Balance Cannot be Negative."+"\n");
			}
		}
		
	public void getSavingDepositeInput() {
			System.out.println("Saving Account Balance:"+moneyFormat.format(savingbalance));
			System.out.println("Amount you want to deposit from Saving Account: ");
			double amount = input.nextDouble();
			
			if((savingbalance+amount)>=0)
			{
				calcSavingDeposite(amount);
				System.out.println("New Saving Account Balance: "+moneyFormat.format(savingbalance));
			}else {
				System.out.println("Balance Cannot be Negative."+"\n");
			}
		
      }
 }
			
