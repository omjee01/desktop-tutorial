package com.avinash.java8;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Function<Integer, Integer> f = i ->i*i;
		System.out.println("Square of i : "+ f.apply(40));*/
		Scanner c = new Scanner(System.in);
		
		System.out.println("Enter integer value to test");
		int in = c.nextInt();
		Predicate<Integer> p = n->n%2==0;
		Predicate<Integer> p1 = n->n>23;
		System.out.println(in+" is Evenand morew than 23:"+p.and(p1).test(in));
		
	}

}
