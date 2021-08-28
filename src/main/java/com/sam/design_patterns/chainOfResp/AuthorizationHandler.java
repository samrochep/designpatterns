package com.sam.design_patterns.chainOfResp;

public class AuthorizationHandler extends Handler {
	
	AuthorizationHandler(Handler handler){
		this.handler=handler;
	}

	@Override
	public Boolean handle(Request request) {
		Boolean status = Boolean.FALSE;
		if(request!=null) {
			status = request.getReqId()>10;
			if(status) {
				System.out.println("****Authorization is successful****");
				status=this.handler!=null?this.handler.handle(request):status;
			} else {
				System.out.println("****Authorization is failed****");
			}
		}
		return status;
	}

}
