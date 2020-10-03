package com.zycus.bean;

public class Source {
    public static void main(String[] args){
        //Implement main() function to check your code...
        //don't remove the main() function, you will get error in RUN CODE.
    	
    	Person p1 = new Person("Avinash", "Bangalore", 30);
    	Person p2 = new Person("Abhishek", "Pune", 26);
    	Person p3 = new Person("Amit", "Thane", 38);
    	Person p4 = new Person("Abhay", "Mumbai", 40);
    	Account acS = new SavingsAccount();
    	Account.createSavingsAccount(p1, 111, 12000);
    	Account.createSavingsAccount(p2, 112, 10000);
    	Account.createSavingsAccount(p3, 113, 9000);
    	Account.createSavingsAccount(p4, 114, 20000);
    	
    	Account.createCurrentAccount(p1, 101, 2200);
    	Account.createCurrentAccount(p2, 102, 2000);
    	Account.createCurrentAccount(p3, 103, 1200);
    	Account.createCurrentAccount(p4, 104, 500);
    	
    	Account.accounts.get(111).credit(550);
    }
}