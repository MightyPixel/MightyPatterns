package net.mightypixel;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

public class Problem implements Component {
	
	private List<Component> problems;
	private String overview;
	
	public Problem(String overview) {
		problems = new ArrayList<>();
		this.overview = overview;
	}
	
	public void addProblem(Component problem) {
		problems.add(problem);
	}
	
	
	@Override
	public void solve() {
		// Concrete compose implementation of the solving method
		// Solves all of it's Problems
		for (Component component : problems) {
			out.println("To " + overview + " you need to: ");
			component.solve();
		}
	}

}
