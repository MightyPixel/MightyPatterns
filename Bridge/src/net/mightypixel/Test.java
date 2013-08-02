package net.mightypixel;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		GarbagePacker packer = new GarbagePacker();
		
		packer.setPacker(new EcoPacker());
		
		packer.Pack();
		
		
	}

}
