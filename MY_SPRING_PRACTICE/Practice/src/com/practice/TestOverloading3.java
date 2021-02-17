package com.practice;

 /*class TestOverloading3 {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(int a, int b) {
		return a + b;
	}
}*/



/**
**
***
****
*****
*******/

//Factorial of 6 = 720


//Str1 = “Date”, Str2=”Timestamp”
//After swap: Str1 = “Timestamp”, str2 = “Date”

/*  
 * Str1= str1+str2;//DateTimeStamp
 * 
 * str2="";
 * str2=str2+chatAt(i 0->str1.length()-1)//Date
 * str1=str1.subString(4,str1.length());
 * 
 * 
 */
/*Enter two numbers: 
	2.2
	3.3
	Enter an operator (+, -, *, /): *
	2.2 * 3.3 = 7.26*/

 public class TestOverloading3 {
	 static int getFactorial(int n){
		 int fact=1;
		 while(n>=1){
			 fact= fact*n;
			 n--;
			 getFactorial(n);
		 }
		 
		return fact;
	 }
	 
	 double doOperation(char operator, double a, double b){
		 double result = 0;
		 
		 switch (operator) {
		case '+':
			result= a+b;
			break;
		case '-':
			result= a-b;
			break;
		case '*':
			result= a*b;
			break;
		case '/':
			result= a/b;
			break;
		default:
			break;
		}
		 
		 return result;
	 }
	 
	static public void main(String[] args) {
		/*for(int i=1; i<=6;i++){
			for(int j=i; j>0; j--){
				System.out.print("*");
			}
			System.out.println();
		}*/
		//System.out.println("Factorial"+getFactorial(6));
		String str1 = "Date";
		String str2="Timestamp";
		str1= str1+str2;
		//System.out.println("str1:" + str1+"\n Str2: "+str2);
		int l= str2.length();
		str2="";
		for(int i=0; i<str1.length()-l;i++){
		str2=str2+str1.charAt(i);
		}
		//System.out.println("str1:" + str1+"\n Str2: "+str2);
		str1=str1.substring(str2.length(), str1.length());//  subString(4,str1.length());
		System.out.println("str1:" + str1+"\n Str2: "+str2);
		
		
	}
}