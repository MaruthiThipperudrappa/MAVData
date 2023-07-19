package com.javaexpress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.javaexpress.repositories.PersonRepository;

@SpringBootApplication
public class SbDataJpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SbDataJpaProjectApplication.class, args);
		PersonRepository repository=context.getBean(PersonRepository.class);
		System.out.println(repository.getClass());
		/*
		 * System.out.println(repository.fetchallusers());
		 * System.out.println(repository.fetchAllusername());
		 * System.out.println(repository.fetchUserInfoById(1));
		 */
		//System.out.println(repository.findByUserNameAndemailId("Maruthi", "Maruthi.t67@gmail.com"));
		System.out.println(repository.updateUserNameForEmail("yashaswi", "Maruthi.t68@gmail.com"));
}
}