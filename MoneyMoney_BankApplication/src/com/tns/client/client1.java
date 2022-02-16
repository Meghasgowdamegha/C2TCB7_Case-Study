package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class client1 {

	private static BankFactory factory;
	private static SavingAcc savingAcc;
	private static CurrentAcc currentAcc;

	public static void main(String[] args) {
		

        factory = new MMBankFactory();
		

		savingAcc = factory.getNewSavingAccount(122, "qwer", 200000, true);
		savingAcc.withdraw(500000);
		System.out.println("Your Account balance is "+savingAcc.getAccBal());

		currentAcc = factory.getNewCurrentAccount(2345, "rtr", 50000, 100000);
		currentAcc.withdraw(2000);
		System.out.println("Your Account balance is "+currentAcc.getAccBal());

		System.out.println(currentAcc.toString());
		System.out.println(savingAcc.toString());
	}

}