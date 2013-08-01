package net.mightypixel;

public class Cipher {

	private String confidentialEncryptionAlgorithm;
	private String integrityEncryptionAlgorithm;
	
	public void setConfidentialEncryptionAlgorithm(
			String confidentialEncryptionAlgorithm) {
		this.confidentialEncryptionAlgorithm = confidentialEncryptionAlgorithm;
	}

	public void setIntegrityEncryptionAlgorithm(
			String integrityEncryptionAlgorithm) {
		this.integrityEncryptionAlgorithm = integrityEncryptionAlgorithm;
	}
	
	@Override
	public String toString() {
		return "This cipher is encoded using " + confidentialEncryptionAlgorithm +
				" for confidentiality and " + integrityEncryptionAlgorithm + " for integrity";
	}
	
}
