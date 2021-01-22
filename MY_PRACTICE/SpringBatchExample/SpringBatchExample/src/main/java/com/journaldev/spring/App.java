package com.journaldev.spring;

import java.util.Scanner;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	/*public static void main(String[] args) {

		String[] springConfig = { "spring/batch/jobs/job-batch-demo.xml" };

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("DemoJobXMLWriter");

		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();

		try {

			JobExecution execution = jobLauncher.run(job, jobParameters);
			System.out.println("Exit Status : " + execution.getStatus());

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Done");
		context.close();
	}*/
	
	
	public static void main(String args)
	{
		Scanner ob= new Scanner(System.in);
		double p= ob.nextDouble();
		System.out.println("enter principal");
		double r= ob.nextDouble();
		System.out.println("enter rate");
		double t= ob.nextDouble();
		System.out.println("enter time");
		double ci;
		//ci= p*(1+r/100)^t;
		ci = p*(Math.pow(1+r/100, t));
		System.out.println("print ci"+ci);
	}
}
