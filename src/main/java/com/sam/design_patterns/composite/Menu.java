package com.sam.design_patterns.composite;

import java.util.Iterator;
import java.util.List;

import com.google.common.collect.Lists;



public class Menu extends MenuComponent{
	List<MenuComponent> menuComponents = Lists.newArrayList();
	
	public Menu(String name) {
		this.name=name;
	}
  
	@Override
	void add(MenuComponent menuComponent) {
		this.menuComponents.add(menuComponent);
	}

	@Override
	void remove(MenuComponent menuComponent) {
		this.menuComponents.remove(menuComponent);
	}

	@Override
	MenuComponent getChild(int i) {
		System.out.println("getChild method");
		System.out.println("size==> "+this.menuComponents.size());
		System.out.println("index==> "+i);
		System.out.println("this.menuComponents.get(i)==> "+this.menuComponents.get(i));
		return this.menuComponents.get(i);
	}

	@Override
	String getName() {
		return this.name;
	}

	@Override
	void print() {
		System.out.println("******** "+this.getName()+"  ********");
		System.out.println();
		Iterator <MenuComponent> iterator = this.menuComponents.iterator();
		while(iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
		
	}

}
