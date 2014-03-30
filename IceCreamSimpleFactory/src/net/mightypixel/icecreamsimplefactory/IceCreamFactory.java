package net.mightypixel.icecreamsimplefactory;

enum IceCreamType {
	vanila,
	chocolate
};

public class IceCreamFactory {
	
	public IceCream createIceCream (IceCreamType type) {
		switch (type) {
			case vanila:
				return new VanilaIceCream();
			case chocolate:
				return new ChocolateIceCream();
		}
		return null;
	}
}
