package com.dwr.schedular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class SpringBootSchedularApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootSchedularApplication.class, args);

		System.out.println("Application started successfully");
	}

}
