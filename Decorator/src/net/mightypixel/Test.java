package net.mightypixel;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sandwich s = new MeatDecorator(new SaladDecorator(new Bread()));
		s.getEaten();
		
	}

}
