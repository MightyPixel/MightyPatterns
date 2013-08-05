package net.mightypixel;

public class Memento {

	private int seed;
	
	public Memento (int seed) {
		this.seed = seed;
	}
	
	public int getSavedState() {
		return seed;
	}
	
}
