package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc 
{

    private static final float charges=1000; 
	public GSPrimeAcc() 
	{
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges)
	{
	   System.out.println("Dear prime user, Your product charges are: "+charges);	
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [getCharges()=" + getCharges() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	}

