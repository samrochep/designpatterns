package com.sam.design_patterns.chainOfResp;

public interface OrderingSystem {
	
	void orderProduct(OrderRequest request);
	void orderProductFromCart(OrderRequest request);

}
