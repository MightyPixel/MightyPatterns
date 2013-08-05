package net.mightypixel;

public class BuyAuction implements Auction {

	private Stock stock;
	
	public BuyAuction (Stock stock) {
		this.stock = stock;
	}
	
	@Override
	public void execute() {
		stock.buy();
	}
	
}
