package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc 
{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}

    @Override
	public void bookProduct(float Charges)
	{
	 System.out.println("dear normal user, Your Charges are: "+charges+" with delivery charge is:"+Charges);
	 //super.bookProduct(deliveryCharge);
	}

	@Override
	public String toString() {
	return "GSNormalAcc [accNo=" + getAccNo() + ", accNm=" + accNm +", charges=" + getCharges() + ", toString()=" + super.toString()
				+ ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
