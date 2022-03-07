package com.tns.application;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc 
{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}
 	
	public MMCurrentAcc() {
		super(accNo, accNm, creditLimit, creditLimit);
		//TODO Auto-generated constructor stub
	}
	
	public void withdraw(float accBal)
	{
		System.out.println("your credit limit is:"+creditLimit+"your acc bal is:"+accBal);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", CreditLimit()=" + getCreditLimit()
				+ ", accNo()=" + getAccNo() + ", getaccBal()=" + getaccBal() + ", getAccNm()=" + getAccNm()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}



