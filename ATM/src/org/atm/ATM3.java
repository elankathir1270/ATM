package org.atm;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM3 {
	
	public static void main(String[] args) {
		
		ArrayList<ATM> atm=new ArrayList<ATM>();
		ArrayList<ATM2> input=new ArrayList<ATM2>();
		
		atm.add(new ATM(12120, 1211, 1000));
		atm.add(new ATM(12121, 1212, 2000));
		atm.add(new ATM(12122, 1213, 3000));
		atm.add(new ATM(12123, 1214, 4000));
		atm.add(new ATM(12124, 1211, 5000));
		atm.add(new ATM(12125, 1212, 6000));
		atm.add(new ATM(12126, 1213, 7000));
		atm.add(new ATM(12127, 1214, 8000));
		atm.add(new ATM(12128, 1211, 9000));
		atm.add(new ATM(12129, 1212, 1000));
		
		System.out.println("Welcome to ICICI"+"\n");
		int usr=1;
		Scanner sc=new Scanner(System.in);
		
		while(usr==1) {
			System.out.println("enter 1 to check balance and 2 for withdraw");
			usr=sc.nextInt();
			if(usr==1) {
			ATM21 bal=new ATM21();
			bal.isCheck(atm);
			}
			if(usr==2) {
			ATM2 ipt=new ATM2();
			input.add(ipt);
			ipt.isCorrect(atm, input);
			}
		
		}
	}
}
