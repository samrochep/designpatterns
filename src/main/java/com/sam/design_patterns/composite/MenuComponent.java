package com.sam.design_patterns.composite;

public abstract class MenuComponent {
	protected String name;
	protected int price;
	
	void add(MenuComponent menuComponent)  { 
		throw new UnsupportedOperationException();
	}
	
	void remove(MenuComponent menuComponent){ 
		throw new UnsupportedOperationException();
	}
	
	MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	int getPrice() { 
		throw new UnsupportedOperationException();
	}
	
	abstract String getName();
	abstract void print();

}
