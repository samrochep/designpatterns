package com.sam.design_patterns.chainOfResp;

public class ValidationHandler extends Handler {
	
	ValidationHandler(Handler handler){
		this.handler=handler;
	}

	@Override
	public Boolean handle(Request request) {
		Boolean status = Boolean.FALSE;
		if(request!=null) {
			status = request.getReqId()>20;
			if(status) {
				System.out.println("****Validation is successful****");
				status=this.handler!=null?this.handler.handle(request):status;
			} else {
				System.out.println("****Validation is failed****");
			}
		}
		return status;
	}

}
