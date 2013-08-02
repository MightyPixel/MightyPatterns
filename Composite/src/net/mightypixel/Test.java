package net.mightypixel;

public class Test {
	public static void main(String[] args) {
		Problem p1 = new Problem("Make dinner");
		p1.addProblem(new Task("Go shopping"));
		p1.addProblem(new Task("Clean table"));
		
		Problem p2 = new Problem("Make salad");
		p2.addProblem(new Task("Cut tomattos"));
		p2.addProblem(new Task("Cut kucumber"));
		p2.addProblem(new Task("Mix ingredients"));
		p1.addProblem(p2);
		
		Task p3 = new Task("Bake bread");
		p1.addProblem(p3);
		
		p1.solve();
	}
}
