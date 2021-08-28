package com.sam.design_patterns.chainOfResp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
	
	private int productId;
	private String productName;
	private int price;
	
	public Product(@JsonProperty("productId")int productId, @JsonProperty("productName")String productName, @JsonProperty("price")int price) {
		this.productId=productId;
		this.productName=productName;
		this.price=price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
