package com.sam.design_patterns.protectedproxy;

import org.springframework.stereotype.Service;

@Service
public class ProtectedProxyClient {
	
	private Internet internet;
	
	ProtectedProxyClient() {
		internet = new ProxyInternet();
	}
	
	public void connectTo(String site) {
		internet.connectTo(site);
	}

}
