package com.sam.design_patterns.interpreter;

public class DivideExpression implements Expression {

	private Expression numberExpression1;
	private Expression numberExpression2;
	
	DivideExpression(Expression numberExpression1,Expression numberExpression2) {
		this.numberExpression1=numberExpression1;
		this.numberExpression2=numberExpression2;
	}

	@Override
	public int interpret() {
		return this.numberExpression2.interpret()/this.numberExpression1.interpret();
	}
	
	@Override
	public String toString() {
		return "-";
	}

}
