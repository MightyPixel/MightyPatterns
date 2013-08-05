package net.mightypixel;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton sharedInstance = Singleton.getSharedInstance();
		Singleton s1 = Singleton.getSharedInstance();
		
		System.out.println("Same instance? " + (sharedInstance == s1));
	}

}
