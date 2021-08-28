package com.sam.design_patterns.composite;

public class ResturantApp {
	
	private MenuComponent menus;
	
	public ResturantApp(MenuComponent menus) {
		this.menus=menus;
	}
	
	public void printMenus() {
		menus.print();
	}

}
