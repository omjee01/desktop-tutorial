package com.avinash.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StringCleaner {
	
	
	/*
	 * 
	 * 
	 * Sample Input
Goodbye bye bye world world world
Sam went went to to to his business
Reya is is the the best player in eye eye game
in inthe
Hello hello Ab aB

Sample Output
Goodbye bye world
Sam went to his business
Reya is the best player in eye game
in inthe
Hello Ab*/
	
	
	static String getUniqWordString(String s){
		Set<String> out  = new LinkedHashSet<>();
		String output = "";
		String [] sArr = s.split(" ");
		for(int i=0; i<sArr.length; i++){


			out.add(sArr[i]);
				
			
		}
		for(String stmp : out){
			output =output+stmp+" ";
		}
				
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		
		String in ="Goodbye bye bye world world world"+"\n"+"Sam went went to to to his business"+"\n"+"Reya is is the the best player in eye eye game"+"\n"+"in inthe"+"\n"+"Hello hello Ab aB";
		System.out.println(getUniqWordString(in));
	}

}
