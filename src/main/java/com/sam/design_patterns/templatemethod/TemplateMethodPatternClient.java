package com.sam.design_patterns.templatemethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemplateMethodPatternClient {
	
	@Autowired
	private ConnectionTemplate connectionTemplate;
	
	public void insertData(String textFile) {
		connectionTemplate.run(textFile);
	}

}
