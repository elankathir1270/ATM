package org.atm;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM2 {
	
	int refCode;
	int pin;
	int amount;
	
	Scanner sc=new Scanner(System.in);
	public ATM2() {
		System.out.println("Insert Card/Enter RefCode");
		try {
		refCode=sc.nextInt();
		}catch(Exception e){
			System.out.println("Wrong input");
		}
		System.out.println("Enter your pin");
		pin=sc.nextInt();
		System.out.println("Enter the Amount");
		amount=sc.nextInt();
	}
	public void isCorrect(ArrayList<ATM> atm,ArrayList<ATM2> input) {
		int index=1;
		int resultAmount=0;
		for (ATM a : atm) {
			if((a.getRefCode()==refCode) && (a.getPin()==pin) ) {
				resultAmount=a.getAmount();
				break;
			}
			else if(index<atm.size()) {
				index++;
			}else {
				System.out.println("Invalid pin");
				System.exit(0);
			}
		}
		
		
		int balance=0;
		for (ATM2 b: input) {	
			if(b.amount>resultAmount) {
				System.out.println("Insufficient amount"+"\n"+"Thank you visit again");
				System.exit(0);
			}
			balance=resultAmount-b.amount;
		System.out.println("collect the amount: "+b.amount);
		}
		
		System.out.println("your current balance is: "+balance);
		System.out.println("Thank you visit again");
	}
	}



