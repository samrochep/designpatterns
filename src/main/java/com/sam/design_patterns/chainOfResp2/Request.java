package com.sam.design_patterns.chainOfResp2;

public class Request {
	
	private int reqId;
	private String emailType;
	
	public String getEmailType() {
		return emailType;
	}
	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}
	public int getReqId() {
		return reqId;
	}
	public void setReqId(int reqId) {
		this.reqId = reqId;
	}
}
