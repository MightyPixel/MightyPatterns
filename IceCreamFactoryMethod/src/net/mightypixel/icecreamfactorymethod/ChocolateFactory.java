package net.mightypixel.icecreamfactorymethod;

public class ChocolateFactory implements IceCreamFactory {

	@Override
	public IceCream createIceCream() {
		return new ChocolateIceCream();
	}

}
