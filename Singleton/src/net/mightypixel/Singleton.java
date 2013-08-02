package net.mightypixel;

public class Singleton {
	private static Singleton instace;
	
	private Singleton() {
		System.out.println("Instanced");
	}
	
	public static Singleton getSharedInstance () {
		if (instace == null) {
			System.out.println("Called for Instantiation");
			instace = new Singleton();
		}
		
		System.out.println("Returning instance");
		
		return instace;
	}
	
}
