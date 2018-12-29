package com.practice.springbootstarter.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class JdbcH2ExampleMain implements CommandLineRunner {

	@Autowired
	private ExampleClient client;
	 public static void main(String[] args) {
	        SpringApplication sa = new SpringApplication(JdbcH2ExampleMain.class);
	        sa.setBannerMode(Banner.Mode.OFF);
	        sa.run(args);
	    } 
	 
	@Override
	public void run(String... arg0) throws Exception {
		client.run();
	}

}
