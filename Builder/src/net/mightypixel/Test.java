package net.mightypixel;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CipherDirector director = new CipherDirector();

		CipherBuilder aesCmac = new AesCmacCipherBuilder();
		CipherBuilder desHmac = new DesHmacCipherBuilder();
		
		director.setCipherBuilder(aesCmac);
		director.constructCipher();
		System.out.println(director.getCipher());
		
		director.setCipherBuilder(desHmac);
		director.constructCipher();
		System.out.println(director.getCipher());
	}

}
