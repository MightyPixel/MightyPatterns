package net.mightypixel;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PresentFactory vehicleFactory = new VehicleFactory();
		PresentFactory plushFactory = new PlushFactory();
		vehicleFactory.createGirlPresent();
		plushFactory.createGirlPresent();
		
	}

}
