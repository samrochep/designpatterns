package com.sam.design_patterns.composite;

import org.springframework.stereotype.Service;

@Service
public class CompositePatternTestApp {
	
	public void testCompositePattern() {
		MenuComponent breakFastMenu = new Menu("BreakFast Menu");
		MenuComponent lunchMenu = new Menu("Lunch Menu");
		MenuComponent dinnerMenu = new Menu("Dinner Menu");
		
		MenuComponent coffeeMenu = new Menu("Coffee Menu");
		MenuComponent saladMenu = new Menu("Salad Menu");
		MenuComponent dessertMenu = new Menu("Dessert Menu");
		
		MenuComponent allMenus = new Menu("All menus");
		
		allMenus.add(breakFastMenu);
		allMenus.add(lunchMenu);
		allMenus.add(dinnerMenu);
		
		breakFastMenu.add(new MenuItem("Idly",50));
		breakFastMenu.add(new MenuItem("Dosa",100));
		
		lunchMenu.add(new MenuItem("Fish Curry with steamed rice",500));
		lunchMenu.add(new MenuItem("Chicken Curry with steamed rice",450));
		
		dinnerMenu.add(new MenuItem("Fish Curry",450));
		dinnerMenu.add(new MenuItem("Chicken Curry",400));
		
		coffeeMenu.add(new MenuItem("Cappuccino",600));
		coffeeMenu.add(new MenuItem("Espresso",550));
		
		breakFastMenu.add(coffeeMenu);
		
		saladMenu.add(new MenuItem("Greek Salad",700));
		saladMenu.add(new MenuItem("Garden Salad",800));
		
		lunchMenu.add(saladMenu);
		
		dessertMenu.add(new MenuItem("Chocalate Brownie",650));
		dessertMenu.add(new MenuItem("Caramel Custard",600));
		dinnerMenu.add(dessertMenu);
		
		allMenus.print();
		
		System.out.println("****** print only breakfast menu ******");
		breakFastMenu.print();
		
		System.out.println();
		
		System.out.println("****** print only dessert menu ******");
		dessertMenu.print();
		
		System.out.println("****** print only 3rd child of lunch menu ******");
		lunchMenu.getChild(2).print();
		
		System.out.println("****** Removed lunch ******");
		allMenus.remove(lunchMenu);
		allMenus.print();
		
		
		
		
	}

}
