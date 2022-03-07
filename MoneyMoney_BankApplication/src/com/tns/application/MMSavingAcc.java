package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc 
{
	
	private static final float MINBAL=500;
	
	public float getMINBAL() {
		return MINBAL;
	}
	
	public MMSavingAcc()
	{
		super(accNo, accNm, MINBAL, isSalaried);
		//TODO Auto-generated constructor stub
	}
	
	public void withdraw(float accBal)
	{
	System.out.println("your acc bal is:"+accBal+"min bal is:"+MINBAL);	
	}
	
	 @Override
	public String toString() {
	return super.toString();
	}
	
}


	

	
	

