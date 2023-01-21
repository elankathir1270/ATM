package org.atm;

import java.util.ArrayList;
import java.util.Scanner;

public class FINALMAIN {
	
	public static void main(String[] args) {
		
		ArrayList<ATMDB> atm=new ArrayList<ATMDB>();
		ArrayList<USERIP2> input=new ArrayList<USERIP2>();
		
		atm.add(new ATMDB(12120, 1211, 1000));
		atm.add(new ATMDB(12121, 1212, 2000));
		atm.add(new ATMDB(12122, 1213, 3000));
		atm.add(new ATMDB(12123, 1214, 4000));
		atm.add(new ATMDB(12124, 1211, 5000));
		atm.add(new ATMDB(12125, 1212, 6000));
		atm.add(new ATMDB(12126, 1213, 7000));
		atm.add(new ATMDB(12127, 1214, 8000));
		atm.add(new ATMDB(12128, 1211, 9000));
		atm.add(new ATMDB(12129, 1212, 1000));
		
		System.out.println("Welcome to ICICI"+"\n");
		int usr=1;
		Scanner sc=new Scanner(System.in);
		
		while(usr==1) {
			System.out.println("enter 1 to check balance and 2 for withdraw");
			usr=sc.nextInt();
			if(usr==1) {
			USERIP1 bal=new USERIP1();
			bal.isCheck(atm);
			}
			if(usr==2) {
			USERIP2 ipt=new USERIP2();
			input.add(ipt);
			ipt.isCorrect(atm, input);
			}
		
		}
	}
}
