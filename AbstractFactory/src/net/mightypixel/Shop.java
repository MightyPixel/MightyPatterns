package net.mightypixel;

public class Shop {
	
	private PresentFactory factory;
	
	public Shop (PresentFactory factory) {
		this.factory = factory;
	}
	
	public void getAvailablePresents () {
		System.out.print("For Boy: ");
		this.factory.createBoyPresent();
		System.out.print("For Girl: ");
		this.factory.createGirlPresent();
	}

}
