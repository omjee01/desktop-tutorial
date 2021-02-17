package com.avinash.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// get() and load() example
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		//get() exmaple get student for a particular id
		Student st = (Student)session.get(Student.class, 11);
		
		//load() exmaple get student for a particular id
		Student st2 = (Student)session.get(Student.class, 17);
		
		System.out.println(st);
		System.out.println(st2);
		
		session.close();
		factory.close();

	}

}
