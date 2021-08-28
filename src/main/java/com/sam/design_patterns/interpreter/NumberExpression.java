package com.sam.design_patterns.interpreter;

import org.apache.commons.lang3.StringUtils;

public class NumberExpression implements Expression {
	
	private Integer number = 0;
	
	NumberExpression(int number) {
		this.number=number;
	}
	
	NumberExpression(String stringNumber) {
		if(!StringUtils.isEmpty(stringNumber)) {
			this.number=Integer.parseInt(stringNumber);
		}	
	}

	@Override
	public int interpret() {
		return this.number;
	}

	@Override
	public String toString() {
		return this.number.toString();
	}
	
	

}
