package org.atm;

import java.util.ArrayList;
import java.util.Scanner;

public class USERIP1 {
	
	int refCode;
	int pin;
//	int balance;
	
	Scanner sc=new Scanner(System.in);
	public USERIP1() {
		System.out.println("Insert Card/Enter RefCode");
		try {
		refCode=sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("Wrong input");
		}
		System.out.println("Enter your pin");
		pin=sc.nextInt();
	}
	
	public void isCheck(ArrayList<ATMDB> atm) {
		int resultAmount=0;
		int index = 1;
		
		for (ATMDB a : atm) {
			if((a.getRefCode()==refCode) && (a.getPin()==pin)) { 
				resultAmount=a.getAmount();
				System.out.println("your balance is: "+resultAmount);
				break;
			} else if(index < atm.size()) {
				index++;
			}
			else {
				System.out.println("Invalid pin");
				break;
			}
		}
		
		System.out.println("Thank you visit again");
	}
}


