package com.practice.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext appContext = SpringApplication.run(CourseApiApp.class, args);
		
		Environment environment = appContext.getBean(Environment.class);
		String[] activeProfiles = environment.getActiveProfiles();
		for(final String profile:activeProfiles){
			System.out.println("Profile: "+profile);
		}

	}

}
