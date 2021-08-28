package com.sam.design_patterns.interpreter;

import org.apache.commons.lang3.StringUtils;

public class ExpressionParserUtil {
	
	public static boolean isOperator(String expression) {
		return (isAdd(expression) || isSubstract(expression) || isMultiply(expression) || isDivide(expression));
	}

	private static boolean isAdd(String expression) {
		return StringUtils.equals("+", expression);
	}

	private static boolean isSubstract(String expression) {
		return StringUtils.equals("-", expression);
	}

	private static boolean isMultiply(String expression) {
		return StringUtils.equals("*", expression);
	}
	
	private static boolean isDivide(String expression) {
		return StringUtils.equals("/", expression);
	}
	
	public static Expression getOperatorExpression(Expression expression1,Expression expression2, String operator) {
		Expression operatorExpression = null;
		if(isAdd(operator)) {
			operatorExpression= new AddExpression(expression1,expression2);
		}
		if(isSubstract(operator)) {
			operatorExpression= new SubstractExpression(expression1,expression2);
		}
		if(isMultiply(operator)) {
			operatorExpression= new MultiplyExpression(expression1,expression2);
		}
		if(isDivide(operator)) {
			operatorExpression= new DivideExpression(expression1,expression2);
		}
		return operatorExpression;
	}

}
