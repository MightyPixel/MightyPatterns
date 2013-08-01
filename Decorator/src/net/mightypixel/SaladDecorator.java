package net.mightypixel;


/*
 * Optimal Wrapper
 */
public class SaladDecorator extends SandwichDecorator {

	public SaladDecorator(Sandwich sandwich) {
		super(sandwich);
	}

	public void getEaten() {
		super.getEaten();
		System.out.println(" Salad eaten");
	}
}
