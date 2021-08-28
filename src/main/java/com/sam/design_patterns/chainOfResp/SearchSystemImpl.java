package com.sam.design_patterns.chainOfResp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Maps;

@Service
public class SearchSystemImpl implements SearchSystem {

	@Autowired
	private SimpleHandlerFactory simpleHandlerFactory;

	private Map<String, Product> productMap = Maps.newHashMap();

	SearchSystemImpl() {
		Product macBook = new Product(1, "MacBook pro 16", 200000);
		Product iphone = new Product(1, "iphone pro 12", 100000);
		productMap.put("MacBook pro 16", macBook);
		productMap.put("iphone pro 12", iphone);
	}

	@Override
	public void searchProduct(SearchRequest request) {
		if (request != null) {
			Handler handler = simpleHandlerFactory.getHandler(request.getReqType());
			if (handler.handle(request)) {
				Product product = productMap.get(request.getProductName());
				if (product != null) {
					System.out.println("****Product details****");
					System.out.println("Product Id - " + product.getProductId());
					System.out.println("Product Name - " + product.getProductName());
					System.out.println("Price - " + product.getPrice());
				} else {
					System.out.println("****Product Not Found****");
				}

			}
		}
	}

}
