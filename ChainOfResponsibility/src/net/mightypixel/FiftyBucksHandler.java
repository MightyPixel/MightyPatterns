package net.mightypixel;

public class FiftyBucksHandler extends CashHandler {

	@Override
	public void handleCash(int cash) {
		while (cash - 50 >= 0) {
			cash -= 50;
		}
		
		if (cash == 0) {
			System.out.println("Fifty Bucks Handler got the request");
		} else {
			super.handleCash(cash);			
		}
	}

}
