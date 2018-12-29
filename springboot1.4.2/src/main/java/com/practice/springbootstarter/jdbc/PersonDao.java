package com.practice.springbootstarter.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {
	@Autowired
	private JdbcTemplate template;
	
	public void save(Person person){
		String sql = "insert into Person (first_Name, Last_Name, Address) values(?,?,?)";
		template.update(sql, person.getFirstName(), person.getLastName(), person.getAddress());
	}
	
	public List<Person> loadAll(){
		return template.query("select * from Person", (resultSet, i)->{
			return toPerson(resultSet);
		});
		
	}

	private Person toPerson(ResultSet resultSet) throws SQLException {
		Person person = new Person();
		person.setId(resultSet.getLong("ID"));
		person.setFirstName(resultSet.getString("FIRST_NAME"));
		person.setLastName(resultSet.getString("LAST_NAME"));
		person.setAddress(resultSet.getString("ADDRESS"));
		return person;
	}
}
