package net.mightypixel;

public class GarbagePacker {

	protected Packer packer;
	
	public void setPacker(Packer packer) {
		this.packer = packer;
	}
	
	public void Pack() {
		packer.Pack();
	}
	
	
}
