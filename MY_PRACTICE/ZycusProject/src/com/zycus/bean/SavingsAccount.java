package com.zycus.bean;

public class SavingsAccount extends Account {
	public void setAccountDetails(Person accHolder, Integer accNum,
			Integer balance) {
		// write code here to set the accHolder(account holder),accNum(account
		// number),balance and accountType fields
		this.accountType="Savings";
		this.accHolder=accHolder;
		this.accNum=accNum;
		this.balance=balance;
		
	}

	// write a toString() method to to generate account details when the
	// hashmap's "accounts.get(accNum)" method is used to print all the user
	// details in the below format
	// "Name : Arjun Age : 21 City : Bangalore Account Number : 12345 Balance : 1000 Account Type : Savings"
	// (without quotes)
	@Override
	public String toString() {
		return "Name : "+accHolder.name+" Age : "+accHolder.age+" City : "+accHolder.city+" Account Number : "+accNum+" Balance : "+balance+" Account Type : "+accountType;
	}

	// write setter and getter methods to set and get balance with return type
	// Integer
	@Override
	public void setBalance(Integer balance) {
		this.balance=balance;
	}
	@Override
	public Integer getBalance() {
		return balance;
	}

	public String debit(Integer amount) {
		// write code here to handle debiting(withdrawal) from an account
		// if the withdrawal amount makes the balance lesser than zero then
		// return "Cannot deduct more than available balance!"
		
		balance=balance-amount;
		if(balance>0){
			balance=balance+amount;
			return "Cannot deduct more than available balance!";
		}
		// if the withdrawal amount makes the balance lesser than minimum
		// balance(1000) and greater than zero then return ex:
		// "500 Rs. has been successfully debited and the balance is 500 Rs. and minimum balance is not present in account: 1234"
		else if(balance<1000 && balance>0){
			accounts.get(accNum).setBalance(balance);
			return amount+" Rs. has been successfully debited and the balance is "+balance+" Rs. and minimum balance is not present in account: "+accNum;
		}
		// else return ex:
		// "2000 Rs. has been successfully debited and the balance is 1500 Rs. in account: 1234"
		else{
			accounts.get(accNum).setBalance(balance);
			return amount+" Rs. has been successfully debited and the balance is "+balance+" Rs. in account: "+accNum;
		}
	}

	public String credit(Integer amount) {
		// write code here to handle crediting(deposit) to an account
		// update the balance in the hashmap variable Account.accounts
		// return ex:
		// "1000 Rs. has been successfully credited and the balance is 2000 Rs. in account: 1234"
		balance=balance+amount;
		accounts.get(accNum).setBalance(balance);
		return amount+" Rs. has been successfully credited and the balance is "+balance+" Rs. in account: "+accNum;
	}

}
