package com.sam.design_patterns.factoryMethod;

import org.springframework.stereotype.Service;

@Service
public class Village extends Geography {

	Village() {
		this.tax=10;
	}

	@Override
	public Order createOrder(String type,String name) {
		switch (type) {
		case "meal":
			return new MealOrder(name,400);
		case "salad":
			return new SaladOrder(name,500);
		case "dessert":
			return new DessertOrder(name,300);
		case "beverage":
			return new BeverageOrder(name,50);
		default:
			return null;
		}
	}


}
