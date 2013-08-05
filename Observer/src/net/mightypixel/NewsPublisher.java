package net.mightypixel;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {

	private List<Subscriber> subscribers;
	
	public NewsPublisher() {
		subscribers = new ArrayList<>();
	}
	
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
	}
	
	public void unsubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}
	
	public void notifyObservers() {
		for (Subscriber subscriber : subscribers) {
			subscriber.getNotified();
		}
	}
	
}
