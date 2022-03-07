package com.tns.client;

import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.application.MMBankFactory;

import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;
import com.tns.framework.BankAcc;
import com.tns.framework.BankFactory;

public class client 
{
     static BankFactory factory;
	 static MMSavingAcc gssavingobj;
	 static MMCurrentAcc gscurrentobj;

	public static void main(String[] args) {
		MMBankFactory bfobj = new MMBankFactory();
        MMCurrentAcc mmcurrentobj = (MMCurrentAcc) bfobj.getNewCurrentAccount(101,"gaww",20000,50000);
        mmcurrentobj.withdraw(mmcurrentobj.getaccBal());
        mmcurrentobj.toString();
		
		MMSavingAcc mmsavingobj = (MMSavingAcc) bfobj.getNewSavingAccount(234,"ftrd",50000,true);
		mmsavingobj.withdraw(mmsavingobj.getaccBal());
		mmsavingobj.toString();

		
	}

}