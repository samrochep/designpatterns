package com.sam.design_patterns.iterator;

import java.util.Iterator;

import org.springframework.stereotype.Component;

@Component("breakFastMenu")
public class BreakFastMenu implements Menu {

	private static final int MAX_ITEMS = 6;
	private int numberOfItems = 0;
	private MenuItem[] menuItems;
	private String name = "BreakFast Menu";

	public BreakFastMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("Idly", "2 idlies with 4 varites of chutney", 50);
		addItem("Dosa", "one dosa with with 4 varites of chutney", 100);
	}

	public void addItem(String name, String description, int price) {
		MenuItem menuItem = new MenuItem(name, description, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	public Iterator<MenuItem> createIterator() {
		return new BreakFastMenuIterator(menuItems);
	}
	
	public String getName() {
		return name;
	}

}
