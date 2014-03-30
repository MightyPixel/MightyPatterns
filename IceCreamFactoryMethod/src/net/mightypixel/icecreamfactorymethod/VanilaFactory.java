package net.mightypixel.icecreamfactorymethod;

public class VanilaFactory implements IceCreamFactory {

	@Override
	public IceCream createIceCream() {
		return new VanilaIceCream();
	}
	
}
