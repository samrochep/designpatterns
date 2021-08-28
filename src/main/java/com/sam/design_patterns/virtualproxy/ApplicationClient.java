package com.sam.design_patterns.virtualproxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationClient {

	@Autowired
	private OnLoadService onLoadService;
	
	@Autowired
	private ReportGeneratorClient reportGeneratorClient;
	
	public OnLoadObject onLoad(){
		OnLoadObject onLoadObject = new OnLoadObject();
		onLoadService.onLoad();
		onLoadObject.setReportDetails(onLoadService.getReportGenerator().getReportDetails());
		return onLoadObject;
	}
	
	public ReportDetails generateComplexReport(String format){
		return reportGeneratorClient.generateComplexReport(format);
	}

}
