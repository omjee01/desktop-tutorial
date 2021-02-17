package com.practice;

public class TestClass1 {

	static int getFactorial(int n){
		 int fact=1;
		 while(n>=1){
			 fact= fact*n;
			 getFactorial(n-1);
		 }
		 
		return fact;
	 }
	 
	static public void main(String[] args) {
		/*for(int i=1; i<=6;i++){
			for(int j=i; j>0; j--){
				System.out.print("*");
			}
			System.out.println();
		}*/
		System.out.println("Factorial"+getFactorial(6));
	}
}
