package com.avinash.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory = new Configuration().configure().buildSessionFactory();//If we have config file in same location, we don't need to declare the path in configure() method
        
       // SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); //All three codes are similar
        
        /*Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();*/
        //System.out.println(factory.isClosed());
        
        //Creating student
        Student std = new Student();
        std.setId(2);
        std.setName("Amit Jha");
        std.setCity("Purnea");
        
        
        //Creating object of Address class
       /* Address ad = new Address();
        ad.setStreet(112);
        ad.setCity("Bijnaur");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(2365.1);*/
        
        //Reading image
       /* FileInputStream fis = new FileInputStream("src/main/java/avi.jpg");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        System.out.println(std);*/
        
        Session currentSession = factory.openSession();//Creating/opening a session from SessionFactory object
        
        //Session currentSession = factory.getCurrentSession(); //If we have multiple sesion, to get the current session from SessionFactory object
        
        Transaction tx = currentSession.beginTransaction(); //Starting/Beginning the 'individual' transaction
       
        currentSession.save(std);							//Session work
        //currentSession.save(ad);
        tx.commit(); 										//commiting the individual transaction
        
        currentSession.get(Student.class, 1199);
        currentSession.load(Address.class, 1011);
        
        Student st = (Student)currentSession.get(Student.class, 1199);
        Address ad = (Address)currentSession.load(Address.class, 1);
        
        System.out.println(st);
        System.out.println(ad);
        
        currentSession.close();
    }
}
