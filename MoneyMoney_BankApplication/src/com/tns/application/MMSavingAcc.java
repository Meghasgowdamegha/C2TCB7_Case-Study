package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	private static final float accBal=0;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float MINBAL) {
	}

	@Override
	public String toString() {
		return "MMSavingAcc [accNo=" + accNo + ", accBal=" + accBal + ", toString()=" + super.toString()
				+ ", isSalary()=" + isSalary() + ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
	


	

	
	

