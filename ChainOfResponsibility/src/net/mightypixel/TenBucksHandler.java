package net.mightypixel;

public class TenBucksHandler extends CashHandler {

	@Override
	public void handleCash(int cash) {
		while (cash - 10 >= 0) {
			cash -= 10;
		}
		if (cash == 0) {
			System.out.println("Ten Bucks Handler got the request");
		} else {
			System.out.println("Cound not handle the request");
		}
	}
	
}
