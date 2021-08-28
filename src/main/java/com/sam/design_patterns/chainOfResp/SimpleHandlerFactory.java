package com.sam.design_patterns.chainOfResp;

import org.springframework.stereotype.Service;

@Service
public class SimpleHandlerFactory {

	public Handler getHandler(String reqType) {
		Handler handler = null;
		switch (reqType) {
		case "orderProduct":
			handler = new RequestFilterHandler(
					new AuthenticationHandler(new AuthorizationHandler(new ValidationHandler(null))));

			break;
		case "orderProductFromCart":
			handler = new RequestFilterHandler(new AuthenticationHandler(new AuthorizationHandler(null)));

			break;

		case "searchProduct":
			handler = new RequestFilterHandler(new AuthenticationHandler(null));

			break;
		default:
			System.out.println("Invalid reqType");
		}
		return handler;
	}

}
