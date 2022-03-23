package com.tns.application;

import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public MMSavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean isSalaried) 
	{
		MMSavingAcc mmsaving = new MMSavingAcc();
		return mmsaving;
	}

	@Override
	public MMCurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) 
	{
	MMCurrentAcc mmcurrent = new MMCurrentAcc(AccNo, accNm, accBal, creditLimit);
		return mmcurrent;
	}
   
}
