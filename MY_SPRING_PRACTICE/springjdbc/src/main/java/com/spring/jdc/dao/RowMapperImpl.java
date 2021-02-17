package com.spring.jdc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdc.entities.Students;

public class RowMapperImpl implements RowMapper<Students>{

	@Override
	public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
		Students std = new Students();
		std.setId(rs.getInt(1));
		std.setName(rs.getString(2));
		std.setCity(rs.getString(3));
		return std;
	}

}
