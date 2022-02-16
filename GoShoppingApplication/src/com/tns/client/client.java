package com.tns.client;

import com.tns.application.*;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;
    public class client {
    	
	public static void main(String[]args) {
		ShopFactory sp=new GSShopFactory();
		PrimeAcc pa=new GSPrimeAcc(123, "meg", 1000, true);
		NormalAcc na=new GSNormalAcc(143,"meg1",1000,50);
		pa.bookProduct(0);
		na.bookProduct(50);
   	}
}











