package com.spring.jdc;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdc.dao.StudentDao;
import com.spring.jdc.dao.StudentDaoImpl;
import com.spring.jdc.entities.Students;

@Configuration
@ComponentScan(basePackages={"com.spring.jdc.dao"})
public class JdbcConfig {
	
	@Bean(name="ds")
	public DriverManagerDataSource getDataSource(){
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		
		return ds;
	}
	
	@Bean(name="jdbcTemplate")
	public JdbcTemplate getJdbcTemplate(){
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean(name="studentDao")
	public StudentDao getStudentDao() {
		StudentDaoImpl dao = new StudentDaoImpl();
		dao.setJdbcTemplate(getJdbcTemplate());
			
		return dao;
	}

}
