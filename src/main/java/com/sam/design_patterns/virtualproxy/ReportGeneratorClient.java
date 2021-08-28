package com.sam.design_patterns.virtualproxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportGeneratorClient {
	
	@Autowired
	private OnLoadService onLoadService;
	
	public ReportDetails generateComplexReport(String format) {
		ReportGenerator reportGenerator = onLoadService.getReportGenerator();
		reportGenerator.generateComplexReport(format);
		return reportGenerator.getReportDetails();
	}

}
