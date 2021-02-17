package com.avinash.java8;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Practice {
	
	//S = {Madam, Test, TestString}
	static List<String> getCharStrCount (String [] input){
		List<String> out = new ArrayList<>();
		
		for(String s : input){
			s=s.toLowerCase();
			Map<Character, Integer> temp=new LinkedHashMap<>();
			String tmp ="";
			for(int i=0; i<s.length(); i++){
				/*if (temp.size()<1){
					temp.put(s.charAt(i), 1);
				}else{*/
					
					if(temp.containsKey(s.charAt(i)))
						temp.put(s.charAt(i), temp.get(s.charAt(i))+1);
					else
						temp.put(s.charAt(i), 1);
				//}
			}
			for(Entry<Character, Integer> e : temp.entrySet()){
				tmp = tmp+(e.getKey()+""+e.getValue());
			}
			out.add(tmp);
			
		}
		
		
		return out;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []S = {"Madam", "Test", "TestString"};
		System.out.println(	getCharStrCount(S));

	}

}
 