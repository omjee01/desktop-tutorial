package com.avinash.ch1.exercises;

import java.util.Scanner;

public class R1_2_To_7_MultipleCheck {
	
	public static boolean isMultiple(long n, long m){
		
		return (n%m==0 ? true : false);
	}
	
	public static boolean isOdd(int i){ //R1_3
		boolean ret = true;
		for (int j=0; j<i; j++){
			ret = !ret;
		}
		return ret;
	}
	
	public static int getLiniearSumFaster(int n){  //R1_4
		return n*(n+1)/2;
	}
	
	public static int getLiniearSumBrut(int n){  //R1_4
		int sum=0;
		
		for(int i=n; i>0; i--){
			sum = sum+i;
		}
		return sum;
	}
	
	public static int getLiniearSumEvenFaster(int m){  //R1_5
		int n = m/2;
		return n*(n+1);
	}
	
	public static int getLiniearSumEvenBrut(int n){  //R1_5
		int sum=0;
		
		for(int i=n; i>0; i--){
			if(i%2 == 0)
			sum = sum+i;
		}
		return sum;
	}
	
	public static int getSquareSumEvenFaster(int n){  //R1_6
		//int n = m/2;
		return n*(n+1)*(2*n+1)/6;
	}
	
	public static int getSquareSumEvenBrut(int n){  //R1_6
		int sum=0;
		
		for(int i=n; i>0; i--){
			//if(i%2 == 0)
			sum = sum+(i*i);
		}
		return sum;
	}
	public static int getVowelCount(String s){  //R1_7
		int count=0;
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='A' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='E'
					|| s.charAt(i)== 'i' || s.charAt(i)=='I' || s.charAt(i)=='o'
					|| s.charAt(i)== 'O' || s.charAt(i)== 'u' || s.charAt(i)=='U')
				count = count+1;
			
		}
		return count;
	}
	
	public static StringBuilder removePunctuations(StringBuilder s){  //R1_8
		
		for(int i = 0; i<s.length(); i++){
			if((int)s.charAt(i) >= 33 && (int)s.charAt(i) <= 47 || 
					(int)s.charAt(i) >= 58 && (int)s.charAt(i) <= 64 ||
					(int)s.charAt(i) >= 91 && (int)s.charAt(i) <= 96){
				s.deleteCharAt(i);
			}
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Provide 2 inputs for multiple check:");
		int n = sc.nextInt(); //m=sc.nextInt();
		System.out.println(isMultiple(n, m));
		System.out.println(isOdd(n));
		System.out.println("Liniear Sum:\t"+getLiniearSumFaster(n));
		System.out.println("Liniear Sum Brut:\t"+getLiniearSumBrut(n));
		System.out.println("Liniear Sum Even:\t"+getLiniearSumEvenFaster(n));
		System.out.println("Liniear Sum Even:\t"+getLiniearSumEvenBrut(n));
		System.out.println("Square Sum Faster:\t"+getSquareSumEvenFaster(n));
		System.out.println("Square Sum Brut:\t"+getSquareSumEvenBrut(n));
		System.out.print("Enter the input String:");
		String s = sc.nextLine();
		System.out.println("Vowel Count:\t"+getVowelCount(s));*/
		StringBuilder sb = new StringBuilder("Let's Try, Mike!");
		System.out.println(removePunctuations(sb));
		
		
	}

}
