package net.mightypixel.banksingleton;

public class Test {

	static void testBankCaseOne() {
		Bank bank = new Bank();
		System.out.println(bank.getBankCapital());
		bank.addMoneyToBank(1000);
		System.out.println(bank.getBankCapital());
	}
	
	static void testBankCaseTwo() {
		Bank bank = new Bank();
		System.out.println(bank.getBankCapital());
	}
	
	static void testBankCaseThree() {
		Bank bank = new Bank();
		bank.closeBank();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello, Singleton!");
		// testBankCaseOne();
		// testBankCaseTwo();
//		testBankCaseThree();
//		testBankCaseTwo();
		SimpleBank myBank = SimpleBank.sharedIstance();
		myBank.capital();
	}
}