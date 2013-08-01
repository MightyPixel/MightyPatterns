package net.mightypixel;

public class DesHmacCipherBuilder extends CipherBuilder {

	@Override
	public void buildConfidentiality() {
		cipher.setConfidentialEncryptionAlgorithm("DES");
	}

	@Override
	public void buildIntegrity() {
		cipher.setIntegrityEncryptionAlgorithm("HMAC");
	}

}
