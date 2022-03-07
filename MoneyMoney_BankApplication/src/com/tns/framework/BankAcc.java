package com.tns.framework;

public class BankAcc 
{

protected static int accNo;
protected static String accNm;
protected float accBal;

public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getAccNm() {
	return accNm;
}
public void setAccNm(String accNm) {
	this.accNm=accNm;
}
public float getaccBal() {
	return accBal;
}
public void setAccBal(float accBal) {
	this.accBal = accBal;
}

public BankAcc(int accNo, String accNm, float accBal)
{
	
	this.setAccNo(accNo);
	this.setAccNm(accNm);
	this.accBal = accBal;
}
public void withdraw(float accBal)
{
System.out.println("acc bal is:"+accBal);
}
public void deposite(float accBal)
{
System.out.println("acc bal after withdraw:"+accBal);
}
      
@Override
public String toString() {
	return "BankAcc [accNo=" + accNo + ", accNm=" + getAccNm() + ", accBal=" + accBal + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
  }

}
