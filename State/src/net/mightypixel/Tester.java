package net.mightypixel;

public class Tester {

	public static void main(String[] args) {

		VendingMachine machine = new VendingMachine();
		machine.setState(new ReadyState());
		machine.updateState();
		machine.setState(new BussyState());
		machine.updateState();
		
	}

}
