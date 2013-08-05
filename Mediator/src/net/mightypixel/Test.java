package net.mightypixel;

public class Test {

	public static void main(String[] args) {

		ChatRoom chat = new ChatRoom();
		Participant alice = new Participant("Alice", chat);
		Participant bobo = new Participant("Bob", chat);
		Participant james = new Participant("James", chat);
		
		
		alice.sendMessage("Hello");
		bobo.sendMessage("Hi");
		james.sendMessage("Greatings");
		
		
	}

}
