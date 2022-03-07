package com.tns.framework;

public interface BankFactory 
{

 public abstract SavingAcc getNewSavingAccount(int accNO, String accNm, float accBal, boolean isSalaried);
 public abstract CurrentAcc getNewCurrentAccount(int accNO, String accNm, float accBal, float creditLimit);
 }
