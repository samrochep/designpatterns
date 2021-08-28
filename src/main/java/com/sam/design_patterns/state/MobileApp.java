package com.sam.design_patterns.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileApp {

	@Autowired
	private MobileContext mobileContext;

	public void changeTheStateOfMobile() {
		mobileContext.execute();
	}

}
