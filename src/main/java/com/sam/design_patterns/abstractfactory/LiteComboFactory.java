package com.sam.design_patterns.abstractfactory;

import java.util.List;

import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Service
public class LiteComboFactory extends ComboFactory {

	@Override
	public List<Order> createOrder() {
		return Lists.newArrayList(new MealOrder("Fish Curry with Steamed Rice", 800),
				new DessertOrder("Chocolate Brownie", 500));
	}

}
