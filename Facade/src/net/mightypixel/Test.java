package net.mightypixel;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SystemFacade facade = SystemFacade.sharedFacade();
		
		facade.SubSystemOne();
		facade.SubSystemTwo();
		facade.SubSystemThree();
		facade.SubSystemFour();
		
	}

}
