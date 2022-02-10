package com.tns.framework;

public abstract class BankFactory {

 public abstract SavingAcc getNewSavingAccount(int AccNO, String accNm, float accBal, boolean isSalaried);
 public abstract CurrentAcc getNewCurrentAccount(int AccNO, String accNm, float accBal, float creditLimit);
 }
