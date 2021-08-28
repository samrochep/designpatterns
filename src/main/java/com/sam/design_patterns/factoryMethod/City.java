package com.sam.design_patterns.factoryMethod;

import org.springframework.stereotype.Service;

@Service
public class City extends Geography {
	
	City() {
		this.tax=30;
	}

	@Override
	public Order createOrder(String type,String name) {
		switch (type) {
		case "meal":
			return new MealOrder(name,600);
		case "salad":
			return new SaladOrder(name,700);
		case "dessert":
			return new DessertOrder(name,500);
		case "beverage":
			return new BeverageOrder(name,100);
		default:
			return null;
		}
	}


}
