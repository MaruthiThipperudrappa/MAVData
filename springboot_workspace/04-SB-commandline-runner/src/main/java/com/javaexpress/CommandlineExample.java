package com.javaexpress;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandlineExample implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Database operation can executed");
		System.out.println("non parsing arg");
		Arrays.stream(args).forEach(System.out::println);
		
	}

}
