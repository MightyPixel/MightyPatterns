package net.mightypixel;

public class AndExpression extends LogicalExpression {
	
	private LogicalExpression expressionOne;
	private LogicalExpression expressionTwo;

	public AndExpression(LogicalExpression firstExpression, LogicalExpression secondExpression) {
		this.expressionOne = firstExpression;
		this.expressionTwo = secondExpression;
	}
	
	@Override
	public boolean intrepret(String context) {
		return expressionOne.intrepret(context) && expressionTwo.intrepret(context);
	}

}
