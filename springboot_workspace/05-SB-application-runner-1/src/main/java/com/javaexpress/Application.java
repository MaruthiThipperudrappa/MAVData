package com.javaexpress;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("application runner is executed");
		var optionsName=args.getOptionNames();
		System.out.println("args.getOptionNames--"+optionsName);
		System.out.println(args.containsOption("first-argument"));
		System.out.println(args.containsOption("second-argument"));
		System.out.println(args.getOptionValues("second-argument"));
		System.out.println(args.getNonOptionArgs());
	}
}
