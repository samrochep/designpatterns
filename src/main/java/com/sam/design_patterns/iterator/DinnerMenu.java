package com.sam.design_patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Component;

@Component("dinnerMenu")
public class DinnerMenu implements Menu {

	private ArrayList<MenuItem> menuItems;
	private String name = "Dinner Menu";

	public DinnerMenu() {
		menuItems = new ArrayList<MenuItem>();

		addItem("Fish Curry", "Spicy Fish curry", 500);

		addItem("Chicken Curry", "Garlic Chicken Curry", 400);

	}

	private void addItem(String name, String description, int price) {
		MenuItem menuItem = new MenuItem(name, description, price);
		menuItems.add(menuItem);
	}

	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
	@Override
	public String getName() {
		return name;
	}

}
