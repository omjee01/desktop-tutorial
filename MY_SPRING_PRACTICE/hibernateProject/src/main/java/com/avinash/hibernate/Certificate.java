package com.avinash.hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {

	private String course;
	private int duration;
	private String instructor;
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public Certificate(String course, int duration, String instructor) {
		super();
		this.course = course;
		this.duration = duration;
		this.instructor = instructor;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Certificate [course=" + course + ", duration=" + duration
				+ ", instructor=" + instructor + "]";
	}
	
	
}
