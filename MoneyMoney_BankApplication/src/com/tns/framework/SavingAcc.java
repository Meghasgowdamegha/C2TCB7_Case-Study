package com.tns.framework;

public class SavingAcc extends BankAcc
{

public static boolean isSalaried;	

public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.setSalary(isSalaried);
	}
public void withdraw(float withdraw)
{
	System.out.println("Balance after withdraw:"+accBal);
}

@Override
public String toString() {
	return "SavingAcc [isSalaried()=" + isSalaried() + ", accNo()=" + getAccNo() + ", accBal()=" + getaccBal()
			+ ", accNm()=" + getAccNm() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}
public boolean isSalaried() {
	return isSalaried;
}

public void setSalary(boolean isSalaried) {
	this.isSalaried= isSalaried;
 }
}
