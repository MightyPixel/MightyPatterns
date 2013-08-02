package net.mightypixel;

public class SystemFacade {

	private static SystemFacade facade;
	
	private SubSystemOne systemOne;
	private SubSystemTwo systemTwo;
	private SubSystemThree systemThree;
	private SubSystemFour systemFour;
	
	private SystemFacade () {
		systemOne = new SubSystemOne();
		systemTwo = new SubSystemTwo();
		systemThree = new SubSystemThree();
		systemFour = new SubSystemFour();
	}
	
	public static SystemFacade sharedFacade() {
		if (facade == null) {
			facade = new SystemFacade();
		}
		
		return facade;
	}
	
	public void SubSystemOne() {
		systemOne.operation();
	}
	
	public void SubSystemTwo() {
		systemTwo.operation();
	}
	
	public void SubSystemThree() {
		systemThree.operation();
	}
	
	public void SubSystemFour() {
		systemFour.operation();
	}
	
}
