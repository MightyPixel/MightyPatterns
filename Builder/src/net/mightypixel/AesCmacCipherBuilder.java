package net.mightypixel;

public class AesCmacCipherBuilder extends CipherBuilder {

	@Override
	public void buildConfidentiality() {
		cipher.setConfidentialEncryptionAlgorithm("AES");
	}

	@Override
	public void buildIntegrity() {
		cipher.setIntegrityEncryptionAlgorithm("CMAC");
	}

}
