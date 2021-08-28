package com.sam.design_patterns.virtualproxy;

import org.springframework.stereotype.Service;

@Service
public class OnLoadService {
	
	private ReportGenerator reportGenerator = null;
	
	public void onLoad() {
		if(reportGenerator==null) {
			reportGenerator = new ReportGeneratorProxy();
		}
		System.out.println("Inside onload service "+reportGenerator);
	}
	
	public ReportGenerator getReportGenerator () {
		return this.reportGenerator;
	}

}
