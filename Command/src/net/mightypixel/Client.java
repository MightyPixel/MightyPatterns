package net.mightypixel;

public class Client {

	public static void main(String[] args) {
		
		Stock sampleStock = new Stock();
		
		Agent agent = new Agent();
		agent.placeAuction(new BuyAuction(sampleStock));
		agent.placeAuction(new SellAuction(sampleStock));
		
		agent.invokeFirstAuction();
		agent.invokeFirstAuction();
		
	}

}
