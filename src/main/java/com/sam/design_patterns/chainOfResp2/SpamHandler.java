package com.sam.design_patterns.chainOfResp2;

import org.apache.commons.lang3.StringUtils;

import com.sam.design_patterns.chainOfResp2.Handler;
import com.sam.design_patterns.chainOfResp2.Request;

public class SpamHandler extends Handler {

	SpamHandler(Handler handler) {
		this.handler = handler;
	}

	@Override
	public void handle(Request request) {
		if(request!=null) {
			if(StringUtils.equals("spamEmail", request.getEmailType())) {
				System.out.println("This is a spam email, so deleting it");
			} else if(this.handler!=null){
				this.handler.handle(request);
			}
		} 
	}
}
