package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;

public class client {
	public client() {
		//TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
	MMBankFactory mmBankObj =new MMBankFactory();
	//mmBank Obj.getNewSavingsAccount(1,"101A'100'true);
	MMSavingAcc savingAccObj = new MMSavingAcc(2,"101B",100,true);
	savingAccObj.withdraw(500);
	System.out.println(savingAccObj.toString());
	mmBankObj.getNewCurrentAccount(1,"101A",100,5000);
	MMCurrentAcc currentAccObj = new MMCurrentAcc(1,"101A",200,5000);
	currentAccObj.withdraw(100);
	System.out.print(currentAccObj.toString());
	}
}