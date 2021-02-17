package com.avinash.hbmmapping.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One2OneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//Creating answer for Question
		Answer a1= new Answer(12121, "Java is High level programming language.");
		//Creating Question
		Question q1 = new Question(1212, "What is Java?", a1);
		a1.setQuestion(q1);
		
		//Creating answer for Question
		Answer a2= new Answer(12131, "API to work on group of objects.");
		//Creating Question
		Question q2 = new Question(1213, "What is Collection?", a2);
		a2.setQuestion(q2);
		
		//Creating answer for Question
		Answer a3= new Answer(12141, "IDE to work on codes or projects.");
		//Creating Question
		Question q3 = new Question(1214, "What is Java?", a3);
		a3.setQuestion(q3);
		
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		session.save(q1);
		session.save(q2);
		session.save(q3);
		
		session.save(a1);
		session.save(a2);
		session.save(a3);
		
		tx.commit();
		session.close();
		factory.close();

	}

}
