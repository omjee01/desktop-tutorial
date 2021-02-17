package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class ReferenceApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context =
        		 new ClassPathXmlApplicationContext("com/springcore/ref/referenceconfig.xml");
       /* B objB = (B) context.getBean("bRef");
        System.out.println(objB);*/
        
        A objA = (A) context.getBean("aRef");
        System.out.println(objA);

    }
}
