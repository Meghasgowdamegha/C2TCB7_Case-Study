package com.tns.framework;

public abstract class CurrentAcc extends BankAcc {
	
	private final float creditLimit;
	
public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

public void withdraw(float creditLimit)
{
	
 }
@Override
public String toString() {
	return "CurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accNm=" + getAccNm() + ", accBal=" + accBal
			+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}



}
