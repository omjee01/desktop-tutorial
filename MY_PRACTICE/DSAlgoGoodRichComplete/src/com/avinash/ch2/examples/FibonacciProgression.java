package com.avinash.ch2.examples;

public class FibonacciProgression extends Progression{
	protected long prev;
	
	public FibonacciProgression(){
		this(0,1);
	}
	
	public FibonacciProgression(long first, long second){
		super(first);
		prev = second - first;
	}
	
	protected void advance(){
		long temp = prev;
		prev =  current;
		current +=temp;
	}
	
	public static void main (String []avi){
		FibonacciProgression fp = new FibonacciProgression();
		
		fp.printProgression(5);
	}
}
