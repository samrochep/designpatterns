package com.sam.design_patterns.protectedproxy;

import java.util.List;

import com.google.common.collect.Lists;

public class ProxyInternet implements Internet {
	
	private Internet realInternet;
	
    private static List<String> restrictedSites=Lists.newArrayList();
    
    static {
    	restrictedSites.add("facebook.com");
    	restrictedSites.add("youtube.com");
    	restrictedSites.add("gmail.com");
    }
	
	ProxyInternet() {
		realInternet=new RealInternet();
	}

	@Override
	public void connectTo(String site) {
		if(restrictedSites.contains(site)) {
			System.out.println(site + " is restricted");
		} else {
			realInternet.connectTo(site);
		}

	}

}
