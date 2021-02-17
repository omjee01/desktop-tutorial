package com.springcore.stereotypAnnot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotypAnnot/stereotypeconfig.xml");
		Student std = context.getBean("ob", Student.class);
		System.out.println(std);
	}

}
