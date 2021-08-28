package com.sam.design_patterns.interpreter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterpreterClient {
	
	@Autowired
	private ExpressionParser expressionParser;

	public int parseExpression(ExpressionRequest expressionRequest) {
		return expressionParser.parseExpression(expressionRequest);
	}

	

}
