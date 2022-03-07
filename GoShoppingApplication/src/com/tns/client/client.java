package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopAcc;
import com.tns.framework.ShopFactory;

public class client 
{
	private static final String Megh = null;
	static ShopFactory sfobj;
	static GSPrimeAcc gsprimeobj;
	static GSNormalAcc gsnormalobj;

	public static void main(String[] args) 
	{
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewNormalAccount(101,"Megha", 700, 50);
		gssfactory.getNewPrimeAccount(101,"Megha2",700, true);
		
		GSNormalAcc gsNormal = new GSNormalAcc(101, "Navya", 700, 50);
		gsNormal.getAccNm();
		gsNormal.getAccNo();
		gsNormal.getCharges();
		gsNormal.getDeliveryCharge();
		gsNormal.bookProduct(50);
		gsNormal.toString();
		
		GSPrimeAcc gsPrime = new GSPrimeAcc();
		gsPrime.getAccNm();
		gsPrime.getAccNo();
		gsPrime.getCharges();
		gsPrime.bookProduct(700);
		gsPrime.toString();
		
	}
}
