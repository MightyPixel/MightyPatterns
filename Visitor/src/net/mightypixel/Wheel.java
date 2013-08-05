package net.mightypixel;

public class Wheel extends CarElement {

	public Wheel(String name) {
		super(name);
	}

	@Override
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}

}
