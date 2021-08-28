package com.sam.design_patterns.chainOfResp2;

import org.springframework.stereotype.Service;

@Service("SimpleHandlerFactoryOfGamingSystem")
public class SimpleHandlerFactory {

	public Handler getHandler() {
		return new FanHandler(new ComplaintHandler
				(new SpamHandler(new ChangeRequestHandler(null))));
	}

}
