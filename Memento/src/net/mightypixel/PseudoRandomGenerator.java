package net.mightypixel;

/*
 * The Memento's caretaker class
 */
public class PseudoRandomGenerator {
	
	private int seed;
	
	public void setSeed(int seed) {
		this.seed = seed;
	}
	
	public Memento saveToMemento() {
		System.out.println("Saving to memento with seed " + seed);
		return new Memento(seed);
	}
	
	public void restoreFromMemento(Memento memento) {
		seed = memento.getSavedState();
		System.out.println("Restored memento to " + seed);
	}
	
	public int generate() {
		return seed++;
	}
	
	
}
