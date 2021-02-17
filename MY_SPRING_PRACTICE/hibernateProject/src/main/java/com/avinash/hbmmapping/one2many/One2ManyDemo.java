package com.avinash.hbmmapping.one2many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One2ManyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//Creating Question
		Question q1 = new Question(1212, "What is Java?", null);
		//Creating answer for Question
		Answer a11= new Answer(12121, "Java is High level programming language.");
		a11.setQuestion(q1);
		Answer a12= new Answer(12122, "Java is Based on OOPS Concept.");
		a12.setQuestion(q1);
		Answer a13= new Answer(12123, "Java Has many frameworks.");
		a13.setQuestion(q1);
		List<Answer> al = new ArrayList<>();
		al.add(a11);
		al.add(a12);
		al.add(a13);
		
		q1.setAnswer(al);
		
		Session session = factory.openSession();
		//Creating Question
		Question q2 = new Question(1213, "What is Collection?", null);
		//Creating answer for Question
		Answer a21= new Answer(12131, "API to work on group of objects.");
		a21.setQuestion(q2);
		Answer a22= new Answer(12132, "It holds property of DS.");
		a22.setQuestion(q2);
		Answer a23= new Answer(12133, "List, Map, Vector, Tree, Stack, Queue are definded in it.");
		a23.setQuestion(q2);
		al=new ArrayList<>();
		al.add(a21);
		al.add(a22);
		al.add(a23);
		
		q2.setAnswer(al);
		
		//Creating Question
		Question q3 = new Question(1214, "What is Java?", null);
		//Creating answer for Question
		Answer a31= new Answer(12141, "IDE to work on codes or projects.");
		a31.setQuestion(q3);
		Answer a32= new Answer(12142, "IDEs are having JDK >> JRE inbuilt in it.");
		a23.setQuestion(q3);
		Answer a33= new Answer(12143, "IDEs are used to create large projects in any language.");
		a33.setQuestion(q3);
		al=new ArrayList<Answer>();
		al.add(a31);
		al.add(a32);
		al.add(a33);
		q3.setAnswer(al);
		
		
		Transaction tx = session.beginTransaction();
		
		session.save(a11);
		session.save(a12);
		session.save(a13);
		
		session.save(a21);
		session.save(a22);
		session.save(a23);
		
		session.save(a31);
		session.save(a32);
		session.save(a33);
		
		session.save(q1);
		session.save(q2);
		session.save(q3);
		
		tx.commit();
		
		Question q = session.get(Question.class,1212 );
		
		System.out.println(q.getQuestionId()+" \n"+q.getQuestion()+"\n"+q.getAnswer());
		session.close();
		factory.close();

	}

}
