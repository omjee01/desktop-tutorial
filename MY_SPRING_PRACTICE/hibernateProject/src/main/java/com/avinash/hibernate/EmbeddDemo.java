package com.avinash.hibernate;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddDemo {

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		// TODO Auto-generated method stub
		
		System.out.println("Embedd Demo working");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Certificate certificate = new Certificate();
		certificate.setCourse("Java-Hibernate");
		certificate.setDuration(2);
		certificate.setInstructor("Avinash Kumar");
		
		Student std = new Student();
        std.setId(223);
        std.setName("Amartya Jha");
        std.setCity("Ahamdabad");
        std.setCertificate(certificate);
        
        
        Certificate certificate2 = new Certificate();
		certificate2.setCourse("Java-JDBC");
		certificate2.setDuration(1);
		certificate2.setInstructor("Avinash Kumar");
		
		Student std2 = new Student();
        std2.setId(334);
        std2.setName("Abhinaw Gundla");
        std2.setCity("Jorhat");
        std2.setCertificate(certificate2);
        
        Session session = factory.openSession();
        
        session.save(std);
        session.save(std2);
        Transaction tx = session.beginTransaction();
        
        tx.commit();
        session.close();
        factory.close();

	}

}
