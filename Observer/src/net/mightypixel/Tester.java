package net.mightypixel;

public class Tester {

	public static void main(String[] args) {
		
		NewsPublisher publisher = new NewsPublisher();
		
		publisher.subscribe(new Subscriber("Alice"));
		publisher.subscribe(new Subscriber("Bob"));
		publisher.subscribe(new Subscriber("James"));
		
		publisher.notifyObservers();
	}

}
