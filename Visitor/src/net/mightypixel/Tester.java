package net.mightypixel;

public class Tester {
	
	public static void main(String[] args) {
	      ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	}
	
}
