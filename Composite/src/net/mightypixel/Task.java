package net.mightypixel;


import static java.lang.System.out;

public class Task implements Component {
	private String text;
	
	public Task(String text) {
		this.text = text;
	}
	
	@Override
	public void solve() {
		// Concrete Solving implementation
		out.println(text + " ");
	}
}
