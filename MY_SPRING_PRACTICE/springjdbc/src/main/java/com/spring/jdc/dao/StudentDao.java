package com.spring.jdc.dao;

import java.util.List;

import com.spring.jdc.entities.Students;

public interface StudentDao {
	
	//Insert into DB
	public int insert(Students students);
	
	//Update into DB
	public int modify(Students student);
	
	//Delete from db
	public int delete (int studentId);
	
	//Select single row
	public Students getStudent(int id);
	
	//Selecting multiple Rows
	public List<Students> getSudents();
	
}
