package com.sam.design_patterns.virtualproxy;

public abstract class ReportGenerator {
	
	protected ReportDetails reportDetails;
	abstract public void generateComplexReport(String format);
	abstract public void generateReportTemplate();
	public ReportDetails getReportDetails() {
		return this.reportDetails;
	}
}
