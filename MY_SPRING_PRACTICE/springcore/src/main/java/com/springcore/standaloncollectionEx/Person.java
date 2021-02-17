package com.springcore.standaloncollectionEx;

import java.util.List;
import java.util.Map;

public class Person {
	
	private List<String> friends;
	private Map<String, Integer> courseFees;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(Map<String, Integer> courseFees) {
		this.courseFees = courseFees;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", courseFees=" + courseFees
				+ "]";
	}

}
