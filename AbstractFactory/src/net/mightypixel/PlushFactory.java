package net.mightypixel;

public class PlushFactory extends PresentFactory {

	@Override
	public void createGirlPresent() {
		System.out.println("Created bunny!");

	}

	@Override
	public void createBoyPresent() {
		System.out.println("Created panda!");
	}

}
