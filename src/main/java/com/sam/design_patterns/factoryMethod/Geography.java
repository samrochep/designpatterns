package com.sam.design_patterns.factoryMethod;

public abstract class Geography {
	
	private Order order;
	protected float tax;
	
	public final void placeOrder(String type,String name) {
		this.order = createOrder(type,name);
		this.order.setPrice(calculatePrice());
		System.out.println("Order Placed");
		printOrder();
	}
	
	private int calculatePrice() {
		int price = this.order.getPrice();
		int totalPrice = (int) (price + (price*(this.tax/100)));
		return totalPrice;
	}

	private void printOrder() {
		System.out.println("Name ---> "+this.order.getName());
		System.out.println("Price ---> "+this.order.getPrice());
	}
	

	public abstract Order createOrder(String type,String name);

}
