package com.sam.design_patterns.chainOfResp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderingSystemImpl implements OrderingSystem {

	@Autowired
	private SimpleHandlerFactory simpleHandlerFactory;

	@Override
	public void orderProduct(OrderRequest request) {
		if (request != null) {
			Handler handler = simpleHandlerFactory.getHandler(request.getReqType());
			if (handler.handle(request)) {
				placeOrder(request);
			}
		}
	}

	@Override
	public void orderProductFromCart(OrderRequest request) {
		if (request != null) {
			Handler handler = simpleHandlerFactory.getHandler(request.getReqType());
			if (handler.handle(request)) {
				placeOrder(request);
			}
		}
	}

	private void placeOrder(OrderRequest request) {
		Product product = request.getProduct();
		System.out.println("****Order Placed successfully****");
		System.out.println("****Order details****");
		System.out.println("Product Id - " + product.getProductId());
		System.out.println("Product Name - " + product.getProductName());
		System.out.println("Price - " + product.getPrice());
	}

}
