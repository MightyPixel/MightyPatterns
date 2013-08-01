package net.mightypixel;

public abstract class CipherBuilder {

	protected Cipher cipher;
	
	public Cipher getCipher() {
		return cipher;
	}
	
	public void createNewCipher() {
		cipher = new Cipher();
	}
	
	public abstract void buildConfidentiality();
	public abstract void buildIntegrity();
	
}
