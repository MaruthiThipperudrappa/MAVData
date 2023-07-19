package com.javaexpress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.SpringVersion;
import org.springframework.web.client.RestTemplate;

import javax.persistence.Entity;

@SpringBootApplication
public class Application {

	/*@Autowired
	RestTemplate restTemplate;*/

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Spring Core Version:- " + SpringVersion.getVersion());
	}

	/*@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate((uri, httpMethod) -> {
if (httpMethod.matches())
		});*/
	}

