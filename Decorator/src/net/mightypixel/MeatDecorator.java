package net.mightypixel;

public class MeatDecorator extends SandwichDecorator {

	public MeatDecorator(Sandwich sandwich) {
		super(sandwich);
		// TODO Auto-generated constructor stub
	}

	public void getEaten() {
		super.getEaten();
		System.out.println(" Meat eaten");
	}

}
