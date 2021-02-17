package com.avinash.hibernate.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.avinash.hibernate.Certificate;
import com.avinash.hibernate.Student;

public class StatesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Transient State
		
		//Persistent State
		
		//Detached State
		
		//Removed state
		
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//Creating Student Object
		Student student = new Student();
		student.setId(123);
		student.setName("Amber Herald");
		student.setCity("Madhopur");
		student.setCertificate(new Certificate("Java full Certificate", 10, "Amitabh Bacchan"));
		//Student came in Transient State
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		//When calling session.save(); Student object reaches to Persistant object as it will be available for session as well as gets stored in DB as well
		
		tx.commit();
		session.close();
		//After close() session gets closed and object reaches to detached state. As session does not hold the object but DB still holds the value
		
		factory.close();
		

	}

}
