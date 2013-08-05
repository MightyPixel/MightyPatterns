package net.mightypixel;

public class OrExpression extends LogicalExpression {

	private LogicalExpression expressionOne;
	private LogicalExpression expressionTwo;

	public OrExpression(LogicalExpression firstExpression, LogicalExpression secondExpression) {
		this.expressionOne = firstExpression;
		this.expressionTwo = secondExpression;
	}
	
	@Override
	public boolean intrepret(String context) {
		return expressionOne.intrepret(context) || expressionTwo.intrepret(context);
	}

}
