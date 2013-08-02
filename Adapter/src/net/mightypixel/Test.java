package net.mightypixel;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BadNamedClass util = new BadNamedClass();
		util.badNamedMethod();
		
		Adaptor adaptor = new Adaptor();
		adaptor.wrapedMethod();
		
	}

}
