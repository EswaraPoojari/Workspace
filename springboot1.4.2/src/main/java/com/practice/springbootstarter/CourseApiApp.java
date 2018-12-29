package com.practice.springbootstarter;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.springbootstarter.components.MyProperties;
import com.practice.springbootstarter.components.RandomProperties;
import com.practice.springbootstarter.profile.InventoryService;
import com.practice.springbootstarter.profile.YmlBean;

@SpringBootApplication
public class CourseApiApp {
	//private static final Logger logger = Logger.getLogger(CourseApiApp.class.getName());
	public static void main(String[] args) {
		//logger.warn("--start--");
		ConfigurableApplicationContext context = SpringApplication.run(CourseApiApp.class, args);
		MyProperties bean = context.getBean(MyProperties.class);
		System.out.println(bean);
		RandomProperties randomBean = context.getBean(RandomProperties.class);
		System.out.println(randomBean);
		InventoryService inventory = context.getBean(InventoryService.class);
		inventory.service("Item-1", 2, BigDecimal.valueOf(20.5));
		YmlBean ymlBean = context.getBean(YmlBean.class);
		System.out.println(ymlBean);
		//logger.error("--end--");
		System.out.println(System.getProperty("user.dir"));
	}

}
