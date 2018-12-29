package com.practice.springbootstarter.profile;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("in-memory")
@Qualifier("inMemoryInventoryService")
public class InMemoryInventoryService implements InventoryService {

	@Override
	public void service(String itemName, int qty, BigDecimal unitPrice) {

		System.out.println("Adding Item in InMemoryInventoryService:"+itemName);
	}

}
