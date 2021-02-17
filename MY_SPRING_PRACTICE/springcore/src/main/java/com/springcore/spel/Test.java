package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		
		Demo demoObj = context.getBean("demo", Demo.class);
		
		System.out.println(demoObj);
		
		SpelExpressionParser parser = new SpelExpressionParser();
		Expression ex = parser.parseExpression("22+34*21-2*49+12*2");
		System.out.println(ex.getValue());

	}

}
