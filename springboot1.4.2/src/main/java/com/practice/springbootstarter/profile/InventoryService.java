package com.practice.springbootstarter.profile;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

public interface InventoryService {

	void service(String itemName, int qty, BigDecimal unitPrice);
}
