package net.mightypixel;

public class Subscriber {
	
	private String name;
	
	public Subscriber(String name) {
		this.name = name;
	}
	
	
	public void getNotified() {
		System.out.println(name + " got notified");
	}
	
	public String getName() {
		return name;
	}

}
