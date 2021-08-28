package com.sam.design_patterns.chainOfResp;

public class OrderRequest extends Request {
	
	private int orderId;
	private Product product;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	

}
