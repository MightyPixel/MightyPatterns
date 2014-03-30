package net.mightypixel.icecreambuilder;

public class IceCreamDirector {
	
	private IceCreamBuilder builder;
	
	public IceCreamDirector(IceCreamBuilder Builder) {
		builder = Builder;
	}
	
	final public void createIceCream(String cone, String base, String topping) {
		builder.chooseCone(cone);
		builder.chooseBase(base);
		builder.chooseToppings(topping);
	}
}
