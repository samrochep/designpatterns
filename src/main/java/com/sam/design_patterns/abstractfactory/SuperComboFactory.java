package com.sam.design_patterns.abstractfactory;

import java.util.List;

import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Service
public class SuperComboFactory extends ComboFactory {

	@Override
	public List<Order> createOrder() {
		return Lists.newArrayList(new SaladOrder("Greek Salad", 900),
				new MealOrder("Chicken Curry with Steamed Rice", 800), new DessertOrder("Caramel Custard", 500),
				new BeverageOrder("Coke", 50));
	}

}
