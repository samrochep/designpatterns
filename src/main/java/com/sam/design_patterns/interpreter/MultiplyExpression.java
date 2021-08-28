package com.sam.design_patterns.interpreter;

public class MultiplyExpression implements Expression {

	private Expression numberExpression1;
	private Expression numberExpression2;
	
	MultiplyExpression(Expression numberExpression1,Expression numberExpression2) {
		this.numberExpression1=numberExpression1;
		this.numberExpression2=numberExpression2;
	}

	@Override
	public int interpret() {
		return this.numberExpression1.interpret()*this.numberExpression2.interpret();
	}
	
	@Override
	public String toString() {
		return "*";
	}

}
