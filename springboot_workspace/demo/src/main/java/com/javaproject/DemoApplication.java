package com.javaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import yes.javaproject.school;

@SpringBootApplication
@ComponentScan(basePackages = {"com.javaproject","yes.javaproject"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//Employee e= new Employee();
		//school s=new school();
		
	}

}
