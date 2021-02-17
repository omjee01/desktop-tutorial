package com.springcore.stereotypAnnot;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Student {
	@Value("23")
	private int stdId;
	@Value("Avinash Kumar")
	private String name;
	@Value("Bengaluru")
	private String city;
	
	@Value("#{myMap}")
	private Map<String,String> courses;
	
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", city=" + city
				+ ", courses=" + courses + "]";
	}
	
}
