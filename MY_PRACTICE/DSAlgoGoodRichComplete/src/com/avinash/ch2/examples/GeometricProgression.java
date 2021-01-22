package com.avinash.ch2.examples;

public class GeometricProgression extends Progression{
	
	protected long base;
	
	public GeometricProgression() {
		this(2,1);
	}
	public GeometricProgression(long b){
		this(b,1);
	}
	public GeometricProgression(long b, int start) {
		// TODO Auto-generated constructor stub
		super(start);
		base=b;
	}
	
	protected void advance(){
		current *= base;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricProgression ap2 = new GeometricProgression(5, 2);
		//ap2.advance();
		ap2.printProgression(3);
	}

}
