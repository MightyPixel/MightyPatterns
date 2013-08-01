package net.mightypixel;

public class HardwareTesterProxy implements HardwareTester {

	Hardware hardware;
	
	public void Test() {
		if (hardware == null) {
			hardware = new Hardware();
		}
		
		hardware.Test();
	}

}
