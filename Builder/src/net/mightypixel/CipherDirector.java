package net.mightypixel;

public class CipherDirector {

	private CipherBuilder cipherBuilder;
	
	public void setCipherBuilder(CipherBuilder cipherBuilder) {
		this.cipherBuilder = cipherBuilder;
	}
	
	public Cipher getCipher() {
		return cipherBuilder.getCipher();
	}
	
	public void constructCipher() {
		cipherBuilder.createNewCipher();
		cipherBuilder.buildConfidentiality();
		cipherBuilder.buildIntegrity();
	}

}
