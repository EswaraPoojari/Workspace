package com.practice.springbootstarter.profile;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("production")
@Qualifier("productionInventoryService")
public class InventoryServiceImpl implements InventoryService {

	@Override
	public void service(String itemName, int qty, BigDecimal unitPrice) {
		
		System.out.println("Adding item in Inventory Serive:"+itemName);

	}

}
