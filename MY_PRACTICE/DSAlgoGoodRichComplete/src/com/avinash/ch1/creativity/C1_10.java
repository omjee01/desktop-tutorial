package com.avinash.ch1.creativity;

import java.util.HashMap;
import java.util.Map;

public class C1_10 {
	
	public static Map<String, Integer> getSmallestLargest(int [] arr){
		int small=arr[0], large=arr[0];
		Map<String, Integer> mp = new HashMap<>();
		for(int i : arr){
			if(i < small )
				small = i;
			else if(i > large)
				large = i;
		}
		mp.put("Large", large);
		mp.put("Small", small);
		return mp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,11,12,21,23,22,45,43, 41,39,33};
		System.out.println(getSmallestLargest(arr));

	}

}
