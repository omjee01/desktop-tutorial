package com.avinash.hbmmapping.many2many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.seteId(311);
		e1.seteName("Manoj");
		
		e2.seteId(321);
		e2.seteName("Abhishek");
		
		e3.seteId(331);
		e3.seteName("Avinash ");
		
		
		
		Project p1 = new Project();
		Project p2 = new Project();
		Project p3 = new Project();
		
		p1.setpId(911);
		p1.setpName("ECoomerce Project");
		
		p2.setpId(921);
		p2.setpName("Data Mogration Proect");
		
		p3.setpId(931);
		p3.setpName("ClaimsPro Insurance Suit");
		
		
		List<Employee> empLst1 = new ArrayList<Employee>();
		empLst1.add(e3);
		empLst1.add(e1);
		
		p1.setEmployees(empLst1);
		
		
		
		
		List<Project> projLst1 = new ArrayList<Project>();
		
		projLst1.add(p1);
		projLst1.add(p2);
		projLst1.add(p3);
		
		e2.setProjects(projLst1);
		Transaction tx = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);

		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		tx.commit();
		
		session.close();
		factory.close();

	}

}
