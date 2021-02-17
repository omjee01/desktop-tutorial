package com.avinash.hbmmapping.many2many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	
	@Id
	@Column(name="e_id")
	private int eId;
	
	@Column(name="e_name")
	private String eName;
	
	@ManyToMany
	private List<Project> projects;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Employee(int eId, String eName, List<Project> projects) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.projects = projects;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", projects="
				+ projects + "]";
	}
}
