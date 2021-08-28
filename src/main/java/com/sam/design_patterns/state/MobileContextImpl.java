package com.sam.design_patterns.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileContextImpl extends MobileContext{
	
	@Autowired
	MobileContextImpl(MobileState mobileNormalState) {
		this.state = mobileNormalState;
	}

	@Override
	public void setMobileState(MobileState state) {
		this.state=state;
	}

	@Override
	public void execute() {
		if(this.state!=null) {
			this.state.execute(this);
		}
	}

	@Override
	void process() {
		System.out.println("some processing in MobileContext");
	}

	
	

}
