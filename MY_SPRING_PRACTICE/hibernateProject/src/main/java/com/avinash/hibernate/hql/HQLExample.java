package com.avinash.hibernate.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.avinash.hibernate.Student;

public class HQLExample {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		String query = "from Student where city=:x";
		
		Query q = session.createQuery(query);
		q.setParameter("x", "Jorhat");
		
		List<Student> ls = q.list();
		
		for(Student s : ls){
			System.out.println(s.getName());
		}
		
		session.close();
		factory.close();
		
	}
}
