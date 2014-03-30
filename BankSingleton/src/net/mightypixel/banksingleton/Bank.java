package net.mightypixel.banksingleton;

public class Bank {
	
	public static class InnerBank {
		public static InnerBank sharedBank;

		private double capital;
		
		public InnerBank() {
			capital = 10000;
		}

		public double getCapital() {
			return capital;
		}

		public void addMoney(double amount) {
			capital += amount;
		}
	}
	
	public Bank() {
		System.out.println("Creating Bank");
		if (InnerBank.sharedBank == null) {
			System.out.println("Creating Inner Bank");
			InnerBank.sharedBank = new InnerBank();  
		}
	}
	
	public double getBankCapital() {
		return InnerBank.sharedBank.getCapital();
	}

	public void addMoneyToBank(double amount) {
		InnerBank.sharedBank.addMoney(amount);
	}

	public void closeBank() {
		InnerBank.sharedBank = null;
	}
}
