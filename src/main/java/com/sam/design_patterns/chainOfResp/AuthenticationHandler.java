package com.sam.design_patterns.chainOfResp;

import org.apache.commons.lang3.StringUtils;

public class AuthenticationHandler extends Handler {
	
	AuthenticationHandler(Handler handler){
		this.handler=handler;
	}

	@Override
	public Boolean handle(Request request) {
		Boolean status = Boolean.FALSE;
		if (request != null) {
			User user = request.getUser();
			status = (user != null && StringUtils.equals(user.getUserName(), "Sam")
					&& StringUtils.equals(user.getPassword(), "Sam"));
			if(status) {
				System.out.println("****Authentication is successful****");
				status=this.handler!=null?this.handler.handle(request):status;
			} else {
				System.out.println("****Authentication is failed****");
			}
		}
		return status;
	}

}
