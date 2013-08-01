package net.mightypixel;

/*
 * 'Isa' relation of Sandwich
 */
public abstract class SandwichDecorator implements Sandwich {
	
	private Sandwich sandwich;
	
	public SandwichDecorator(Sandwich sandwich) {
		this.sandwich = sandwich;
	}
	
	@Override
	public void getEaten() {
		sandwich.getEaten();
	}
	
}
