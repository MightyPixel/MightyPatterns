package net.mightypixel;

import java.util.Hashtable;

public class FlyweightFactory {

	private Hashtable<String, Flyweight> flyweights = new Hashtable<>();
	
	public FlyweightFactory() {
		Flyweight f1 = new CamelCaseConcreteFlyweight();
		Flyweight f2 = new CapsRepresentationFlyweight();

		flyweights.put("1", f1);    
		flyweights.put("2", f1);
		flyweights.put("3", f1);
		flyweights.put("4", f2);    
		flyweights.put("5", f2);
		flyweights.put("6", f2);
	}
	
	
	public Flyweight getFlyweight(String key) {
		return (Flyweight)flyweights.get(key);
	}
	
	
}
