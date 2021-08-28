package com.sam.design_patterns.chainOfResp;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Maps;

public class RequestFilterHandler extends Handler {
	
	RequestFilterHandler(Handler handler) {
		this.handler=handler;
	}

	private static Map<String,Integer> ipCountMap = Maps.newHashMap();
	private static final Integer IPCOUNTLIMIT = 5;

	@Override
	public Boolean handle(Request request) {
		Boolean status = Boolean.FALSE;
		if(request!=null) {
			Integer count = ipCountMap.get(request.getIp())!=null?ipCountMap.get(request.getIp())+1:1;
			ipCountMap.put(request.getIp(), count);
			User user = request.getUser();
			status = (user != null && StringUtils.equals(user.getUserName(), "Sam")
					&& StringUtils.equals(user.getPassword(), "Sam")) || (count<=IPCOUNTLIMIT);
			if(status) {
				System.out.println("****This is not a brute force request****");
				status=this.handler!=null?this.handler.handle(request):status;
			} else {
				System.out.println("****This is a brute force request****");
			}
		}
		return status;
	}

}
