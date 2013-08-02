package net.mightypixel;

public class Adaptor {
	
	BadNamedClass adaptee = new BadNamedClass();
	
	public void wrapedMethod () {
		adaptee.badNamedMethod();
	}
	
}
