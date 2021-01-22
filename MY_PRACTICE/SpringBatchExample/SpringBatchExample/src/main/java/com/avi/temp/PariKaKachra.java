package com.avi.temp;

import java.util.Scanner;

public class PariKaKachra
{
	public static void main(String args[])
	{
		Scanner ob= new Scanner(System.in);
		double p= ob.nextDouble();
		System.out.println("enter principal");
		double r= ob.nextDouble();
		System.out.println("enter rate");
		double t= ob.nextDouble();
		System.out.println("enter time");
		double ci;
		//ci= p*(1+r/100)^t;
		ci = p*(Math.pow(1+r/100, t))-p;
		System.out.println("print ci"+ci);
	}

}


