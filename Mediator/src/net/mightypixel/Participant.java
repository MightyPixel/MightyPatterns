package net.mightypixel;

public class Participant {

	private String name;
	private IMediator mediator;
	
	public Participant(String name, IMediator mediator) {
		this.name = name;
		this.mediator = mediator;
		mediator.registerParticipant(this);
	}
	
	public String getName() {
		return name;
	}

	public void receiveMessage(String message) {
		System.out.println(name + " received message: " + message);
	}
	
	public void sendMessage(String message) {
		System.out.println(name + ": send message " + message);
		mediator.postMessage(this, name + ": " + message);
	}
	
}
