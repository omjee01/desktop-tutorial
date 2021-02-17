package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotExample {

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public AnnotExample() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AnnotExample [subject=" + subject + "]";
	}

	@PostConstruct
	public void start(){
		System.out.println("Initializing");
	}
	
	@PreDestroy
	public void end(){
		System.out.println("Ending method");
	}
}
