package com.sam.design_patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class RestaurantApp {
	
	private ArrayList<Menu> menus;
    
	  
	public RestaurantApp(ArrayList<Menu> menus) {
		this.menus = menus;
	}
   
	public void printMenu() {
		Iterator<Menu> menuIterator = menus.iterator();
		while(menuIterator.hasNext()) {
			Menu menu = (Menu)menuIterator.next();
			System.out.println("*****  "+menu.getName()+"  *****");
			printMenu(menu.createIterator());
		}
	}
   
	private void printMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getDescription()+ " - ");
			System.out.print(menuItem.getPrice());
			System.out.println();
		}
	}

}
