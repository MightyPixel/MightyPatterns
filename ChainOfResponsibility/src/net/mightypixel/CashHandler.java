package net.mightypixel;

public abstract class CashHandler {

	private CashHandler nextHandler;
	
	public void handleCash(int cash) {
		nextHandler.handleCash(cash);
	}
	
	public void setNextHandler(CashHandler handler) {
		this.nextHandler = handler;
	}
	
}
