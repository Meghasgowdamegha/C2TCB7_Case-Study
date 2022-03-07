package com.tns.framework;

public class CurrentAcc extends BankAcc {
	
	protected static float creditLimit=50;
	
        public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		CurrentAcc.creditLimit = creditLimit;
	}
   public void withdraw(float creditLimit)
{
   System.out.println("your credit limit is:"+creditLimit);
}
        
    @Override
    public String toString() {
	return "CurrentAcc [CreditLimit()=" + getCreditLimit() + ", accNo()=" + getAccNo() + ", accBal()="
			+ getaccBal() + ", accNm()=" + getAccNm() + ", toString()=" + super.toString() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + "]";
}

public float getCreditLimit() {
		return creditLimit;
		
	}
}




