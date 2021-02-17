package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		/*To call Destroy method we need to call registerShutdownHook(), which is not in ApplicationContext interface*/
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		/*So used AbstractApplicationCotext as registerShutdownHook() is in this interface*/
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		Samosa s1 = (Samosa) context.getBean("s1");
		
		System.out.println(s1);
		
		//Calling this method checks what method is injected in destroy-method attribute in the bean in IoC container. and calls that method.
		//In our case it is destroy() in Samosa bean.
		context.registerShutdownHook();
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		Home home = (Home) context.getBean("home");
		System.out.println(home);
		//context.registerShutdownHook(); no need as one register is enough to call the destroy () if respective bean
		
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		AnnotExample annot = (AnnotExample) context.getBean("annot");
		System.out.println(annot);
	}

}
