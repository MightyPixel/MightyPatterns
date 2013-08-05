package net.mightypixel;

/*
 * Context of the state pattern
 */
public class VendingMachine {
	
	private State currentState;
	
	public void setState(State state) {
		currentState = state;
	}
	
	public void updateState() {
		currentState.updateState(this);
	}

}
