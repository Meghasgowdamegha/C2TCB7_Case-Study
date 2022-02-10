package com.tns.framework;

public abstract class SavingAcc extends BankAcc {

private boolean isSalary;	
	
public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.setSalary(isSalary);
	}

public void withdraw(float accBal)
{	
	
}
@Override
public String toString() {
	return "SavingAcc [isSalary=" + isSalary() + ", accNo=" + accNo + ", accNm=" + getAccNm() + ", accBal=" + accBal
			+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}

public boolean isSalary() {
	return isSalary;
}

public void setSalary(boolean isSalary) {
	this.isSalary = isSalary;
}


}