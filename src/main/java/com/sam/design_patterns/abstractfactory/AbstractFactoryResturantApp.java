package com.sam.design_patterns.abstractfactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbstractFactoryResturantApp {
	
	@Autowired
	private ComboFactory liteComboFactory;
	@Autowired
	private ComboFactory familyComboFactory;
	@Autowired
	private ComboFactory superComboFactory;

	public void placeOrder(String comboType) {
		switch (comboType) {
		case "lite":
			liteComboFactory.placeOrder();
			break;
		case "family":
			familyComboFactory.placeOrder();
			break;
		case "super":
			superComboFactory.placeOrder();
			break;
		default:
			System.out.println("Invalid Combo");
		}
	}

}
