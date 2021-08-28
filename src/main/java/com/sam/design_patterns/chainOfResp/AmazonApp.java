package com.sam.design_patterns.chainOfResp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmazonApp {
	
	@Autowired
	private OrderingSystem orderingSystem;
	
	@Autowired
	private SearchSystem searchSystem;
	
	public void orderProduct(OrderRequest request) {
		orderingSystem.orderProduct(request);
	}
	
    public void orderProductFromCart(OrderRequest request) {
    	orderingSystem.orderProductFromCart(request);
	}
    
    public void searchProduct(SearchRequest request) {
    	searchSystem.searchProduct(request);
	}

}
