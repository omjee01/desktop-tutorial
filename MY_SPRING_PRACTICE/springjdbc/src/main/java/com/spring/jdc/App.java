package com.spring.jdc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdc.dao.StudentDao;
import com.spring.jdc.entities.Students;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
       /* JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        
        //Insert query
        String inserQ = "insert into students (id, name, city) values(?,?,?)";
        
        //Execute query
        int res = template.update(inserQ, 311, "Ahishek Kumar", "Amsterdam");
        System.out.println("Number of rows inserted :\t"+res);*/
        StudentDao dao = context.getBean("studentDao", StudentDao.class);
        
       /* Students st = new Students(999, "Abhinav Sen", "Mumbai");
        
        System.out.println("New row inserted for "+st.getName()+" : "+dao.insert(st));
        
        Students st2 = new Students(123, "Amit Kumar Jha", "Patna");
        
        System.out.println("Old row Updated for : "+st2.getId()+" : "+dao.modify(st2));
        
        System.out.println("Deleting row for "+dao.delete(666));*/
        
        System.out.println("Selecting a row : "+dao.getStudent(311));
        
        System.out.println(dao.getSudents());
        
         
    }
}
