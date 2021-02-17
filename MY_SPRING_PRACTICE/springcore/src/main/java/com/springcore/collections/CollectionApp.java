package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class CollectionApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context =
        		 new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
        
        Emp emp = (Emp) context.getBean("emp");
        
        System.out.println(emp.getName());
        System.out.println(emp.getPhones());
        System.out.println(emp.getAddresses());
        System.out.println(emp.getCourses());
        System.out.println(emp.getProps());
        
        
    }
}
