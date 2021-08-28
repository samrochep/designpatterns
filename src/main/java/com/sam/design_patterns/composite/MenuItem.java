package com.sam.design_patterns.composite;

public class MenuItem extends MenuComponent{
	
	public MenuItem(String name, int price) {
		this.name=name;
		this.price=price;
	}

	@Override
	String getName() {
		return this.name;
	}

	@Override
	int getPrice() {
		return this.price;
	}

	@Override
	void print() {
		System.out.print(this.getName() + " - ");
		System.out.print(this.getPrice());
		System.out.println();
	}

}
