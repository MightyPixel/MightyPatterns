package net.mightypixel.icecreamabstractfactory;

public class FactoryProducer {

	public static SweetsAbstractFacory getSweetFactory(FactoryTypes type) {
		switch (type) {
		case ConeFactory:
			return new ConeFactory();
		case IceCreamFactory:
			return new IceCreamFactory();
		case ToppingsFactory:
			return new ToppingsFactory();
		
		}
		return null;
	}
	
}
