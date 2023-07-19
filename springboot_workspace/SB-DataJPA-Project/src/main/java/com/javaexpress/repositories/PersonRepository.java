package com.javaexpress.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaexpress.entity.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer> {

}
