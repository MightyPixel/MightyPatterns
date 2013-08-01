package net.mightypixel;

public class VehicleFactory extends PresentFactory {

	@Override
	public void createGirlPresent() {
		System.out.println("Created car!");
	}

	@Override
	public void createBoyPresent() {
		System.out.println("Created submarine!");
	}

}
