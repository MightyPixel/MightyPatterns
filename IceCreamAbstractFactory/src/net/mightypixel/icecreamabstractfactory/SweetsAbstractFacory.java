package net.mightypixel.icecreamabstractfactory;

public interface SweetsAbstractFacory {

	public double getConePrice(ConeType type);
	public double getIceCreamPrice(IceCreamType type);
	public double getToppingPrice(ToppingType type);
	
}
