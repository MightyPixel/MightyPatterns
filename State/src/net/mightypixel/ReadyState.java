package net.mightypixel;

public class ReadyState implements State {
	
	@Override
	public void updateState(VendingMachine context) {

		System.out.println(context + " Is Bussy");
		
	}

}
