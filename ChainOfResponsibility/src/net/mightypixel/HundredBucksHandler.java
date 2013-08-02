package net.mightypixel;

public class HundredBucksHandler extends CashHandler {

	@Override
	public void handleCash(int cash) {
		
		while (cash - 100 >= 0) {
			cash -= 100;
		}
		
		
		if (cash == 0) {
			System.out.println("Hundred Bucks Handler got the request");
		} else {
			super.handleCash(cash);			
		}
	}
	
}
