package com.sam.design_patterns.virtualproxy;

public class ReportGeneratorProxy extends ReportGenerator {
	
	private ReportGenerator reportGeneratorImpl = null;
	
	ReportGeneratorProxy() {
		this.reportDetails= new ReportDetails();
	}

	@Override
	public void generateComplexReport(String format) {
		if(reportGeneratorImpl==null) {
			reportGeneratorImpl = new ReportGeneratorImpl();
		}
		reportGeneratorImpl.generateComplexReport(format);
		this.reportDetails = reportGeneratorImpl.getReportDetails();
		System.out.println("Inside ReportGeneratorProxy "+reportGeneratorImpl);
	}

	@Override
	public void generateReportTemplate() {
		System.out.println("Generating report template from proxy class");
	}

}
