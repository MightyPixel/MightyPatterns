package net.mightypixel;

public class SportCarFactory implements CarFactory {

	@Override
	public void makeCar() {
		System.out.println("Lambo");
	}

}
