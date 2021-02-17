package com.spring.jdc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdc.entities.Students;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Students students) {
		// TODO Auto-generated method stub
		String insertQ = "insert into students (id, name, city) values(?,?,?)";
		
		return this.jdbcTemplate.update(insertQ, students.getId(), students.getName(), students.getCity());
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int modify(Students student) {
		String updateQ = "Update students set name=?, city=? where id=?";
		return this.jdbcTemplate.update(updateQ,  student.getName(), student.getCity(),student.getId());
	}

	@Override
	public int delete(int studentId) {
		String deleteQ = "delete from students where id=?";
		return this.jdbcTemplate.update(deleteQ, studentId);
	}

	@Override
	public Students getStudent(int id) {
		String selectQ = "Select * from students where id=? ";
		Students std = this.jdbcTemplate.queryForObject(selectQ, new RowMapperImpl(), 311);
		return std;
	}

	@Override
	public List<Students> getSudents() {
		String queryS = "select * from students";
		List<Students> ls = this.jdbcTemplate.query(queryS,new RowMapperImpl());
		return ls;
	}
}
