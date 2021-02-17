package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{T(java.lang.Math).PI}")
	private double x;
	
	@Value("#{T(java.lang.Math).sqrt(400)}")
	private int y;
	
	@Value("#{new java.lang.String('Avinash')}")
	private String myName;

	public double getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public void setX(double x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", myName=" + myName + "]";
	}

}
