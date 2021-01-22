package com.avinash.ch2.examples;

public class ArithmeticProgression extends Progression{
	
	protected long increment;
	
	public ArithmeticProgression() {
		this(1,0);
	}

	public ArithmeticProgression(long stepSize) {
		this(stepSize, 0);
	}

	public ArithmeticProgression(long stepSize, long start) {
		super(start);
		increment=stepSize;
	}
	
	protected void advance() {
		current += increment;
	}
	
	public static void main(String [] avi) {
		/*ArithmeticProgression ap = new ArithmeticProgression();
		ap.advance();
		ap.printProgression(3);*/
		
		/*ArithmeticProgression ap1 = new ArithmeticProgression(5);
		ap1.advance();
		ap1.printProgression(3);*/
		
		ArithmeticProgression ap2 = new ArithmeticProgression(5, 2);
		//ap2.advance();
		ap2.printProgression(3);
	}

}
