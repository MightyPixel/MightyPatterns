package net.mightypixel;

import java.util.ArrayList;
import java.util.List;

public class Agent {
	
	private List<Auction> auctionQueue;
	
	public Agent() {
		auctionQueue = new ArrayList<>();
	}
	
	/*
	 * Adds auction at as last object in the auctionQueue
	 */
	public void placeAuction(Auction auction) {
		auctionQueue.add(auction);
	}
	
	/*
	 * Invokes the first auction in the queue
	 */
	public void invokeFirstAuction() {
		Auction auction = auctionQueue.get(0);
		auctionQueue.remove(0);
		auction.execute();
	}

}
