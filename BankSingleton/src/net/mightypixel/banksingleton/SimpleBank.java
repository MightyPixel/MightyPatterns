package net.mightypixel.banksingleton;

public class SimpleBank {
	private static SimpleBank bank = new SimpleBank();
	
	private SimpleBank() {};
	
	public static SimpleBank sharedIstance()
	{
		return bank;
	}
	
	public void capital() {
		System.out.println("10000.99");
	}
	
}
