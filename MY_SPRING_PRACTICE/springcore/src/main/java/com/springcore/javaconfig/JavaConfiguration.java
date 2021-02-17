package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*@ComponentScan(basePackages="com.springcore.javaconfig")*/
public class JavaConfiguration {
	
	@Bean
	public Stream getStream(){
		return new Stream();
	}
	
	@Bean
	public Student getStudent(){
		//Creating new Bean object
		Student std = new Student(getStream());
		
		return std;
	}

}
