package net.mightypixel;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CashHandler hundredHandler = new HundredBucksHandler();
		CashHandler fiftyHandler = new FiftyBucksHandler();
		CashHandler tenHandler = new TenBucksHandler();
		
		hundredHandler.setNextHandler(fiftyHandler);
		fiftyHandler.setNextHandler(tenHandler);
		
		hundredHandler.handleCash(361);
		
	}

}
