package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context 
			= new AnnotationConfigApplicationContext(JavaConfiguration.class);
		Student std = context.getBean("getStudent", Student.class);
		System.out.println(std);
		std.study();
	}

}
