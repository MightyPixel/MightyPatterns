package net.mightypixel;

public class SellAuction implements Auction {

	private Stock stock;
	
	public SellAuction (Stock stock) {
		this.stock = stock;
	}
	
	@Override
	public void execute() {
		stock.sell();
	}

}
