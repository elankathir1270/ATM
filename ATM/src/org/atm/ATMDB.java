package org.atm;

import java.util.Scanner;

public class ATMDB {
	
	int refCode;
	int pin;
	int amount;
	
	public ATMDB(int refCode,int pin,int amount) {
		this.refCode=refCode;
		this.pin=pin;
		this.amount=amount;
	}

	
	public int getRefCode() {
		return refCode;
	}

	public void setRefCode(int refCode) {
		this.refCode = refCode;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
		
		
		
		
	

}
