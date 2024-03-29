package com.avinash.ch1.creativity;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C_1_11 {

	public static Map<String, Boolean> checkArithmeticAssiciation(int a, int b, int c){
		Map<String,Boolean> mp = new HashMap<>();
		if(a+b == c)
			mp.put("a+b=c", true);
		else if(a+b != c)
			mp.put("a+b=c", false);
		if(a==b-c)
			mp.put("a == b-c", true);
		else if(a != b-c)
			mp.put("a==b-c", false);
		if(a*b == c)
			mp.put("a*b == c", true);
		else if(a*b != c)
			mp.put("a*b == c", false);
		return mp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println(checkArithmeticAssiciation(a, b, c));
	}

}
