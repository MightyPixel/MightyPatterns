package net.mightypixel;

import java.util.StringTokenizer;

public class TerminalExpression extends LogicalExpression {
	private String literal;

	public TerminalExpression(String literal) {
		this.literal = literal;
	}
	
	@Override
	public boolean intrepret(String context) {
		StringTokenizer tokenizer = new StringTokenizer(context);
		
		while(tokenizer.hasMoreTokens()) {
			String curr = tokenizer.nextToken();
			if (curr.equals(literal)) {
				return true;
			}
		}
		
		return false;
	}

}
