package com.javaexpress;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.javaexpress.entity.Person;
import com.javaexpress.repositories.PersonRepository;

@SpringBootApplication
public class SbDataJpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SbDataJpaProjectApplication.class, args);
		PersonRepository repository=context.getBean(PersonRepository.class);
		System.out.println(repository.getClass());
		
		Iterable<Person>userlist= repository.findAll();
		userlist.forEach(person->System.out.println(person));
		
		long count=repository.count();
		System.out.println("No of records"+count);
		
		Optional<Person> optional=repository.findById(1);
		if(optional.isPresent()) {
				Person per=optional.get();
				System.out.println(per);
		}
		else {
			System.out.println("Record is not present");
		}
		
		Person per=new Person();
		per.setAddress("Malleshpalaya 3rd cross bangalore");
		per.setUserName("Maruthi");
		per.setEmailId("Maruthi.t67@gmail.com");
		repository.save(per);
	}

}
