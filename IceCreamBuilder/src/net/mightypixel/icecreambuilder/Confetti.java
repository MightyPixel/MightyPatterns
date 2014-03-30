package net.mightypixel.icecreambuilder;

public class Confetti implements IceCreamBuilder {

	public Confetti() {

	}

	public void chooseCone(String cone) {
		// TODO Auto-generated method stub
		System.out.println("You are choosing our special Confetti " + cone + " cone!");
	}

	public void chooseBase(String base) {
		// TODO Auto-generated method stub
		System.out.println("Your icecream will be " + base);
	}

	public void chooseToppings(String topping) {
		System.out.println("And will have nice " + topping + " on top!");
	}
	
}
