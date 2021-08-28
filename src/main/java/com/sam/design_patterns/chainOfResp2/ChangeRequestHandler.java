package com.sam.design_patterns.chainOfResp2;

import org.apache.commons.lang3.StringUtils;

import com.sam.design_patterns.chainOfResp2.Handler;
import com.sam.design_patterns.chainOfResp2.Request;

public class ChangeRequestHandler extends Handler {
	
	ChangeRequestHandler(Handler handler) {
		this.handler=handler;
	}

	@Override
	public void handle(Request request) {
		if(request!=null) {
			if(StringUtils.equals("changeRequestEmail", request.getEmailType())) {
				System.out.println("This is a change request email, so sending it to Dev team");
			} else if(this.handler!=null){
				this.handler.handle(request);
			}
		} 
	}

}
