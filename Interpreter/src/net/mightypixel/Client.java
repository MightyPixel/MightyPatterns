package net.mightypixel;

public class Client {

	public static void main(String[] args) {

		LogicalExpression expressionEggs = new TerminalExpression("Eggs");
		LogicalExpression expressionBacon = new TerminalExpression("Bacon");
		LogicalExpression expressionHam = new TerminalExpression("Ham");		
		LogicalExpression expressionBread = new TerminalExpression("Bread");
		
		// Bacon or Ham
		LogicalExpression baconOrHam = new OrExpression(expressionBacon, expressionHam);
		LogicalExpression meatAndBread = new AndExpression(baconOrHam, expressionBread);
		LogicalExpression eggsOrElse = new OrExpression(expressionEggs, meatAndBread);
		
		String context = "Bacon Ham Bread";
		
		System.out.println(context + " is " + eggsOrElse.intrepret(context));
		
		
	}

}
