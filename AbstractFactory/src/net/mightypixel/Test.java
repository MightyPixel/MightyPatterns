package net.mightypixel;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		Shop vehicleShop = new Shop(new VehicleFactory());
		Shop plushShop = new Shop(new PlushFactory());
		
		vehicleShop.getAvailablePresents();
		plushShop.getAvailablePresents();
	}
}
