package com.sam.design_patterns.chainOfResp2;

import org.apache.commons.lang3.StringUtils;

import com.sam.design_patterns.chainOfResp2.Handler;
import com.sam.design_patterns.chainOfResp2.Request;

public class ComplaintHandler extends Handler {
	
	ComplaintHandler(Handler handler) {
		this.handler=handler;
	}

	@Override
	public void handle(Request request) {
		if(request!=null) {
			if(StringUtils.equals("complaintEmail", request.getEmailType())) {
				System.out.println("This is a complaint email, so sending it to legal team");
			} else if(this.handler!=null){
				this.handler.handle(request);
			}
		} 
	}

}
