package com.sam.design_patterns.virtualproxy;

public class ReportGeneratorImpl extends ReportGenerator {
	
	//no. of complex db calls
	ReportGeneratorImpl(){
		
	}
	
	@Override
	public void generateReportTemplate() {
		System.out.println("Generating report template");
	}

	@Override
	public void generateComplexReport(String format) {
		this.reportDetails = new ReportDetails();
		this.reportDetails.setContent("some content");
		System.out.println("Generating complex template in "+ format + " format");
	}

}
