package com.tns.client;

import com.tns.application.MMBankFactory;

import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class client {

	public static void main(String[] args) {

		MMBankFactory mmfactory = new MMBankFactory();
		mmfactory.getNewCurrentAccount(101, "Megha", 30000, 20000);
		mmfactory.getNewSavingAccount(201, "Samanvi", 15000, true);

		MMSavingAcc mmSaving = new MMSavingAcc();
		mmSaving.getAccNo();
		mmSaving.getAccNm();
		mmSaving.getaccBal();
		mmSaving.getMINBAL();
		mmSaving.deposite(10000);
		mmSaving.withdraw(500);
		mmSaving.toString();
		
        MMCurrentAcc mmCurrent = new MMCurrentAcc(291, "Sush", 40000, 30000);
		mmCurrent.getAccNo();
		mmCurrent.getAccNm();
		mmCurrent.getaccBal();
		mmCurrent.getCreditLimit();
		mmCurrent.withdraw(7000);
		mmCurrent.toString();

	}

}
