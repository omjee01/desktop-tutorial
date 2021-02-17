package com.avinash.java8;

public class Practice2 {

	public static Long callFunc(Long v) {
		return v++;
	}

	public static Long callFunc2(Long var1) {
		try {
			System.out.println("Inside Try");
			return var1 + 1;
		} catch (Exception e) {
			System.out.println("Inside Catch");
		} finally {
			System.out.println("Inside Finally");
			return var1 + 2;
		}
	}

	public static void main(String args[]) {
		Long var1 = new Long(1);
		Long var2 = new Long(1);
		if (var1 == var2) {
			System.out.println("True");
		} else {
			System.out.println("False");//False X
		}
		Long val = callFunc(var1);// 1
		System.out.println("The value is: " + val);//1 
		val = callFunc2(var1);// 5 X 3
		System.out.println("The value is: " + val);
		
		
		/*Inside Try
		 * 
		 * Inside Finally
		 * The Value is: 5
		 */
	}
}
