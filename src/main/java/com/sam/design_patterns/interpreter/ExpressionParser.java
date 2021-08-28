package com.sam.design_patterns.interpreter;

import java.util.List;
import java.util.Stack;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Service
public class ExpressionParser {

	public int parseExpression(ExpressionRequest expressionRequest) {
		int output = 0;
		if (expressionRequest != null) {
			String expressionFromRequest = expressionRequest.getExpression();
			System.out.println(expressionFromRequest);
			List<String> expressionList = Lists.newArrayList(expressionFromRequest.split("\\s"));
			Stack<Expression> expressionStack = new Stack<>();
			for (String expression : expressionList) {
				if (!StringUtils.isEmpty(expression) && !ExpressionParserUtil.isOperator(expression)) {
					Expression numberExpression = new NumberExpression(expression);
					expressionStack.push(numberExpression);
					System.out.println("Pushed the number expression " + numberExpression + " to the stack");
				} else if (ExpressionParserUtil.isOperator(expression)) {
					Expression expression1 = expressionStack.pop();
					Expression expression2 = expressionStack.pop();
					Expression operatorExpression = ExpressionParserUtil.getOperatorExpression(expression1, expression2,
							expression);
					Integer result = operatorExpression.interpret();
					System.out.println("Operator Expression " + operatorExpression
							+ " is applied to the number expressions " + expression1 + "," + expression2);
					Expression resultExpression = new NumberExpression(result);
					expressionStack.push(resultExpression);
					System.out.println("Pushed the result expression " + resultExpression + " to the stack");
				}
			}
			Expression outputExpression = expressionStack.pop();
			output=outputExpression.interpret();
		}
		return output;
	}

}
