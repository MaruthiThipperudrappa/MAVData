package com.javaexpress.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaexpress.entity.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer> {
	
	 Person findByUserNameAndAddress(String userName,String address);
	/*
	 * spring JPA query methods
	 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query
	 * -methods
	 */
}
