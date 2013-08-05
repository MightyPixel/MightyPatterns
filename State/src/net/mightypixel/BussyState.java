package net.mightypixel;

public class BussyState implements State {

	@Override
	public void updateState(VendingMachine context) {
		System.out.println(context + " Is Ready");
	}

}
