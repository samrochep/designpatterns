package com.sam.design_patterns.abstractfactory;

import java.util.List;

import org.springframework.util.CollectionUtils;

import com.google.common.collect.Lists;

public abstract class ComboFactory {
	
	private List<Order> orders = Lists.newArrayList();
	
	public final void placeOrder() {
		this.orders=createOrder();
		System.out.println("Combo Order Placed");
		printOrders();
	}
	
	private void printOrders() {
		if(!CollectionUtils.isEmpty(orders)) {
			int totalPrice = 0;
			for(int index=0;index<orders.size();index++) {
				int price = this.orders.get(index).getPrice();
				System.out.println("Item "+(index+1)+"---> "+this.orders.get(index).getName());
				System.out.println();
				totalPrice+=price;
			}
			System.out.println("Price - "+totalPrice);
		}	
	}

	public abstract List<Order> createOrder();
	
	

}
