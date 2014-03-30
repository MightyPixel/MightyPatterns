package net.mightypixel.icecreambuilder;

/**
 * @author mightypixel
 *
 */
public class Tester {

	public static void main(String[] args) {
		IceCreamDirector director = new IceCreamDirector(new Confetti());
		director.createIceCream("Waffle", "Vanila", "Chocolate Chips");
	}
}

