package com.practice.springbootstarter.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationProperties
public class YmlBean {
	
	 @Value("${refresh.rate}")
     private int refreshRate;

    /* public void doSomething() {
         System.out.printf("Refresh Rate : %s%n", refreshRate);
     }*/

	@Override
	public String toString() {
		return "YmlBean [refreshRate=" + refreshRate + "]";
	}
	
	
}
