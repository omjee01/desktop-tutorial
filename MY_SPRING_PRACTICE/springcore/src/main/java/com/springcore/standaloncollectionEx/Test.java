package com.springcore.standaloncollectionEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.autowireEx.Emp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standaloncollectionEx/standalonecollConfig.xml");
		
		Person emp = context.getBean("person", Person.class);
		
		System.out.println(emp.getFriends());
		System.out.println("----------------------------------------------------");
		System.out.println(emp.getCourseFees());

	}

}
