package com.sam.design_patterns.chainOfResp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GamingSystem {
	
	@Autowired
	private SimpleHandlerFactory simpleHandlerFactory;
	
	public void handleEmail(Request request) {
		Handler handler = simpleHandlerFactory.getHandler();
		handler.handle(request);
	}

}
