package com.sam.design_patterns.factoryMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResturantApp {

	@Autowired
	private Geography city;
	@Autowired
	private Geography village;

	public void placeOrder(String placeOfOrder, String type, String name) {
		switch (placeOfOrder) {
		case "city":
			city.placeOrder(type, name);
			break;
		case "village":
			village.placeOrder(type, name);
			break;
		default:
			System.out.println("Invalid place of order");
		}
	}

}
