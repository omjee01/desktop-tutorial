package com.zycus.bean;

import java.util.HashMap;

public abstract class Account {
	Person accHolder;
	Integer accNum;
	Integer balance;
	String accountType;
	// declare a static hashmap variable with name "accounts" with key as
	// Integer and value which can store both objects of type SavingsAccount and
	// CurrentAccount
	static HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();

	public abstract void setAccountDetails(Person accHolder, Integer accNum,
			Integer balance);

	public abstract void setBalance(Integer balance);

	public abstract Integer getBalance();

	public abstract String debit(Integer amount);

	public abstract String credit(Integer amount);

	public static String createSavingsAccount(Person accHolder, Integer accNum,
			Integer balance) {
		// write code to create a savings account object every time this method
		// is called and add the account number as key and object as value to a
		// HashMap of type <Integer,Account>
		SavingsAccount sa = new SavingsAccount();
		
		// use setAccountDetails method in SavingsAccount class to set the
		// values
		// if the balance while creating an account is >=1000 then return
		// "Savings Account SuccessFully Created!" or return
		// "Validation Failed!"
		
			sa.setAccountDetails(accHolder, accNum, balance);
			if(sa.balance>=1000){
			accounts.put(accNum, sa);
			return "Savings Account SuccessFully Created!";
		} else {
			sa=null;
			accHolder=null;
			accNum=null;
			balance=null;
			return "Validation Failed!";
		}
		// if validation fails then set all the fields and SavingsAccount object
		// to null
	}

	public static String createCurrentAccount(Person accHolder, Integer accNum,
			Integer balance) {
		// write code to create a current account object every time this method
		// is called and add the account number as key and object as value to
		// the Accounts.account variable
		CurrentAccount ca = new CurrentAccount();
		// use setAccountDetails method in CurrentAccount class to set the
		// values
		// if the balance while creating an account is >=10000 then return
		// "Current Account SuccessFully Created!" or return
		// "Validation Failed!"
		ca.setAccountDetails(accHolder, accNum, balance);
		if(ca.balance>=1000){
			
			accounts.put(accNum, ca);
			return "Current Account SuccessFully Created!";
		}else {
			ca=null;
			accHolder=null;
			accNum=null;
			balance=null;
			return "Validation Failed!";
		}
		// if validation fails then set all the fields and SavingsAccount object
		// to null
	}
}
